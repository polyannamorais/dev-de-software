import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número da matrícula: ");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		
		int contador = 0;
		do {
			System.out.println("Informe a " + (contador +1) + "° nota entre 0 e 10:");
			double temp = leitor.nextDouble();
			
			if (temp < 0 || temp > 10) {
				System.out.println("A nota " + temp + " é inválida!");
			}
			else {
				notas[contador] = temp;
				contador++;
			}
			
		} while (contador < 5);
		
		System.out.println();
		System.out.println("RELATÓRIO");
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ":" + notas[i]);
		}
		
		leitor.close();
		
	}
	
}