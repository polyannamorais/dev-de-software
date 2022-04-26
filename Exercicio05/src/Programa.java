import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\polya\\OneDrive\\Documentos\\Exercicio05\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		int grupoA = 0;
		int grupoB = 0;
		int grupoC = 0;
		int grupoD = 0;
		int grupoE = 0;
		int grupoF = 0;
		
		while(leitor.hasNext()) {
			String linha =  leitor.nextLine();
			String[] dadosLinha = linha.split("\t");
			
			switch (dadosLinha[0]) {
			
			case "A":
				grupoA += getValor(dadosLinha[1]);
				break;
				
			case "B": 
				grupoB += getValor(dadosLinha[1]);
				break;
				
			case "C": 
				grupoC += getValor(dadosLinha[1]);
				break;
				
			case "D": 
				grupoD += getValor(dadosLinha[1]);
				break;
				
			case "E": 
				grupoE += getValor(dadosLinha[1]);
				break;
				
			case "F": 
				grupoF += getValor(dadosLinha[1]);
				break;
				
			}
			
		}
		
		imprimirGrupo("A", grupoA);
		imprimirGrupo("B", grupoB);
		imprimirGrupo("C", grupoC);
		imprimirGrupo("D", grupoD);
		imprimirGrupo("E", grupoE);
		imprimirGrupo("F", grupoF);
		
		int total = grupoA + grupoB + grupoC + grupoD + grupoE + grupoF;
		System.out.println("Valor total: " + total);
		
		leitor.close();
		
	}
	
	public static void imprimirGrupo(String letra, int vlr) {
		System.out.println("Valor total do grupo " + letra + ":" + vlr);
	}
	
	public static int getValor(String vlr) {
		return Integer.parseInt(vlr);
	}
	
}