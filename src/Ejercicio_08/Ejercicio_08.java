package Ejercicio_08;

public class Ejercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String frase = " Hakuna Matata vive y se feliz, ningun problema debe hacerte sufrir, lo mas facil es saber vivir hakuna matata";
	char caracter = 'a';
		System.out.println("En la frase hay " + numeroCaracter(frase,caracter) + " letras: '" + caracter+ "'");

	}
	
	public static int numeroCaracter(String frase, char caracter){
		char[] fraseChar = frase.toCharArray();
		int contador = 0;

		for (int i = 0; i < fraseChar.length; i++) {

			if (fraseChar[i] == caracter) {
				contador++;
				

			}

		}
		return contador;
		
		
	}
}
