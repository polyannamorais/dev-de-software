
public class Programa {

	public static void main (String[] args) {
		
		String matricula = "1864";
		String nome = "Anne";
		double nota1 = 9.5;
		double nota2 = 9.8;
		double notaFinal = (nota1 + nota2) / 2;
		
		System.out.println("Matícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Nota Final: " + notaFinal);
		
		if (notaFinal >= 6) {
			System.out.println("Aprovado: (X)Sim ( )Não");
		}
		else {
			System.out.println("Aprovado: ( )Sim ( )Não");
		}
		
	}
	
}