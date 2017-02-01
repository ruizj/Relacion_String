package Ejercicio_03;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = "Ana";
		System.out.println("Es Palindromo la palabra?? " + palindromo(entrada));

	}

	public static boolean palindromo(String entrada) {
		String salida = "";
		for (int i = entrada.length() - 1; i >= 0; i--) {

			salida = salida + entrada.charAt(i);

		}

		return salida.equalsIgnoreCase(entrada);

	}
}