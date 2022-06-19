package br.edu.up;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.up.model.Livro;

public class Programa {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("Purple+");
		em = emf.createEntityManager();
		
		execucao();
		
	}
	
	public static void menu(){
		
		System.out.println("\tCadastro de Livros");
		System.out.println("0. Fim");
		System.out.println("1. Inclui");
		System.out.println("2. Altera");
		System.out.println("3. Exclui");
		System.out.println("4. Consulta");
		System.out.println("Op��o: ");
		
	}
	
	public static Integer inclui(){
		
		Scanner entrada = new Scanner(System.in);
		
		Livro novolivro = new Livro();
		
		System.out.println("Voc� entrou no m�todo Inclui.");
		
		System.out.println("T�tulo: ");
		novolivro.setTitulo(entrada.nextLine());
		
		System.out.println("Editora: ");
		novolivro.setEditora(entrada.nextLine());
		
		System.out.println("Autor: ");
		novolivro.setAutor(entrada.nextLine());
		
		System.out.println("Ano: ");
		novolivro.setAno(entrada.nextInt());
		
		em.getTransaction().begin();
		em.persist(novolivro);
		em.getTransaction().commit();
		
		return novolivro.getId();
		
	}
	
	public static Integer altera(){
		
		Scanner entrada = new Scanner(System.in);
		
		String novosdados;
		
		System.out.println("Voc� entrou no m�todo Altera.");
		System.out.println("Informe o ID do livro voc� deseja alterar: ");
		
		Integer livroAltera = entrada.nextInt();
		
		int opcedit;
		
		Livro livro = em.find(Livro.class, livroAltera);
		
		System.out.println("T�tulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Editora: " + livro.getEditora());
		System.out.println("Ano: " + livro.getAno());
		
		System.out.println("Digite o dado que deseja alterar: ");
		System.out.println("1)Titulo | 2)Autor | 3)Editora | 4)Ano");
		
		opcedit = entrada.nextInt();
		
		switch(opcedit) {
		
		case 1:
			System.out.println("Digite o novo t�tulo: ");
			livro.setTitulo(entrada.next());
			em.getTransaction().begin();
			em.merge(livro);
			em.getTransaction().commit();
			break;
			
		case 2:
			System.out.println("Digite o novo autor: ");
			livro.setAutor(entrada.next());
			em.getTransaction().begin(); 
			em.merge(livro);
			em.getTransaction().commit();
			break;
			
		case 3:
			System.out.println("Digite a nova editora: ");
			livro.setEditora(entrada.next());
			em.getTransaction().begin();
			em.merge(livro);
			em.getTransaction().commit();
			break;
			
		case 4:
			System.out.println("Digite o novo ano: ");
			livro.setAno(entrada.nextInt());
			em.getTransaction().begin(); 
			em.merge(livro); 
			em.getTransaction().commit();
			break;
			
		default:
			System.out.println("Op��o n�o encontrada!");
			
		}
		
		return livro.getId();
		
	}
	
	public static Integer exclui() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Voc� entrou no m�todo Exclui.");
		System.out.println("Informe o ID do livro voc� deseja excluir: ");
		
		Integer livroExclui = entrada.nextInt();
		
		Livro livro = em.find(Livro.class, livroExclui); 
		em.getTransaction().begin(); 
		em.remove(livro); 
		em.getTransaction().commit();
		
		return livroExclui;
		
	}
	
	public static Integer consulta(){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Voc� entrou no m�todo Consulta.");
		System.out.println("Informe o ID do livro voc� deseja consultar: ");
		
		Integer livroConsulta = entrada.nextInt();
		
		Livro livro = em.find(Livro.class, livroConsulta);
		
		System.out.println("T�tulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Editora: " + livro.getEditora());
		System.out.println("Ano: " + livro.getAno());
		
		return livroConsulta;
		
	}
	
	public static void execucao() {
		
		int opcao;
		int retorno;
		
		Scanner entrada = new Scanner(System.in);
		
		do{
			
			menu();
			opcao = entrada.nextInt();
			
			switch(opcao){
			
			case 1:
				retorno = inclui();
				if(retorno >= 0) {
					System.out.println("Livro salvo com sucesso!");
					} else {
						System.out.println("Erro ao salvar.");
						}
				break;
				
			case 2:
				retorno = altera();
				if(retorno >= 0) {
					System.out.println("Livro alterado com sucesso!");
					} else {
						System.out.println("Erro ao alterar.");
						}
				break;
				
			case 3:
				retorno = exclui();
				if(retorno >= 0) {
					System.out.println("Livro exclu�do com sucesso!");
					} else {
						System.out.println("Erro ao excluir.");
						}
				break;
				
			case 4:
				retorno = consulta();
				if(retorno >= 0) {
					System.out.println("As informa��es do livro foram retornadas: ");
					} else {
						System.out.println("Erro ao alterar.");
						}
				break;
				
			default:
				System.out.println("Op��o inv�lida.");
				}
			} while(opcao != 0);
		}
	
	public static List<Livro> listarLivros() {
		List<Livro> livros =
				em.createQuery("from Livro", Livro.class)
				.getResultList();
		
		return livros;
		
	}
	
	public static Livro consulta(Integer id) {
		
		Livro livro = em.find(Livro.class, id);
		
		return livro;
		
	}
	
	public static void exclui(Integer id) {
		
		Livro livro = em.find(Livro.class, id);
		em.getTransaction().begin();
		em.remove(livro);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unused")
	
	private static void imprimir(Livro livro) {
		
		System.out.println(livro);
		
	}
	
}