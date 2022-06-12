import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		double [] pesos = {0.05, 0.05, 0.2, 0.2, 0.5};
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o n�mero da matr�cula: ");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		double notaFinal = 0;
		
		int contador = 0;
		do {
			System.out.println("Informe a " + (contador +1) + "� nota entre 0 e 10:");
			double temp = leitor.nextDouble();
			
			if (temp < 0 || temp > 10) {
				System.out.println("A nota " + temp + " � inv�lida!");
			}
			else {
				notas[contador] = temp;
				notaFinal = notaFinal + (notas[contador] * pesos[contador]);
				contador++;
			}
			
		} while(contador < 5);
		
		System.out.println();
		System.out.println("RELAT�RIO");
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ":" + notas[i]);
		}
		
		System.out.println("Nota final: " + notaFinal);
		System.out.println();
		if (notaFinal >= 6) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!");
		}
		
		leitor.close();
		
	}
	
}