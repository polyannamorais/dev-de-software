
public class Programa {

	public static void main (String[] args) {
		
		String[] matriculas = new String[5];
		matriculas[0] = "2002";
		matriculas[1] = "2005";
		matriculas[2] = "2009";
		matriculas[3] = "2020";
		matriculas[4] = "2021";
		
		String[] nomes = new String[5];
		nomes[0] = "Polyanna";
		nomes[1] = "Samuel";
		nomes[2] = "Rick";
		nomes[3] = "Dan";
		nomes[4] = "Gorya";
		
		double[] notas1 = new double[5];
		notas1 [0] = 9.0;
		notas1 [1] = 9.2;
		notas1 [2] = 9.8;
		notas1 [3] = 9.5;
		notas1 [4] = 9.0;
		
		double[] notas2 = new double[5];
		notas2 [0] = 9.0;
		notas2 [1] = 9.5;
		notas2 [2] = 9.9;
		notas2 [3] = 9.8;
		notas2 [4] = 9.2;
		
		double[] notasFinais = new double[5];
		notasFinais[0] = (notas1[0] + notas2[0]) / 2;
		notasFinais[1] = (notas1[1] + notas2[1]) / 2;
		notasFinais[2] = (notas1[2] + notas2[2]) / 2;
		notasFinais[3] = (notas1[3] + notas2[3]) / 2;
		notasFinais[4] = (notas1[4] + notas2[4]) / 2;
		
		System.out.println("Matrícula: " + matriculas[0]);
		System.out.println("Nome: " + nomes[0]);
		System.out.println("Nota Final: " + notasFinais[0]);
		if (notasFinais[0] >= 6) {
			System.out.println("Aprovado: (X)Sim ( )Não");
		}
		else {
			System.out.println("Aprovado: ( )Sim (X)Não");
		}
		
		System.out.println("Matrícula: " + matriculas[1]);
		System.out.println("Nome: " + nomes[1]);
		System.out.println("Nota Final: " + notasFinais[1]);
		if (notasFinais[1] >= 6) {
			System.out.println("Aprovado: (X)Sim ( )Não");
		}
		else {
			System.out.println("Aprovado: ( )Sim (X)Não");
		}
		
		System.out.println("Matrícula: " + matriculas[2]);
		System.out.println("Nome: " + nomes[2]);
		System.out.println("Nota Final: " + notasFinais[2]);
		if (notasFinais[2] >= 6) {
			System.out.println("Aprovado: (X)Sim ( )Não");
		}
		else {
			System.out.println("Aprovado: ( )Sim (X)Não");
		}
		
		System.out.println("Matrícula: " + matriculas[3]);
		System.out.println("Nome: " + nomes[3]);
		System.out.println("Nota Final: " + notasFinais[3]);
		if (notasFinais[3] >= 6) {
			System.out.println("Aprovado: (X)Sim ( )Não");
		}
		else {
			System.out.println("Aprovado: ( )Sim (X)Não");
		}
		
		System.out.println("Matrícula: " + matriculas[4]);
		System.out.println("Nome: " + nomes[4]);
		System.out.println("Nota Final: " + notasFinais[4]);
		if (notasFinais[4] >= 6) {
			System.out.println("Aprovado: (X)Sim ( )Não");
		}
		else {
			System.out.println("Aprovado: ( )Sim (X)Não");
		}
		
	}
	
}