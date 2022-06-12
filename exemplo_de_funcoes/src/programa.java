
public class programa {

	public static void imprimir(String txt) {
		System.out.println(txt);
	}
	
	public static double somar(double a, double b) {
		double vlr = a + b;
		return vlr;
	}
	
	public static double subtrair(double a, double b) {
		double vlr = a - b;
		return vlr;
	}

	public static double multiplicar(double a, double b) {
		double vlr = a * b;
		return vlr;
	}
	
	public static double dividir(double a, double b) {
		double vlr = a / b;
		return vlr;
	}
	
	public static void main(String[] args) {
		
		double valor1 = 100;
		double valor2 = 80;

		System.out.println("A + B");
		double resultado = somar(valor1, valor2);
		String texto = String.valueOf(resultado);
		imprimir(texto);
		
		System.out.println("A - B");
		resultado = subtrair(valor1, valor2);
		texto = String.valueOf(resultado);
		imprimir(texto);
		
		System.out.println("A * B");
		resultado = multiplicar(valor1, valor2);
		texto = String.valueOf(resultado);
		imprimir(texto);
		
		System.out.println("A / B");
		resultado = dividir(valor1, valor2);
		texto = String.valueOf(resultado);
		imprimir(texto);
		
	}
}