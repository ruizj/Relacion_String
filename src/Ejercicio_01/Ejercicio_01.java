package Ejercicio_01;

public class Ejercicio_01 {

	public static void main(String[] args) {
		String frase = " Hakuna Matata vive y se feliz, ningun problema debe hacerte sufrir, lo mas facil es saber vivir hakuna matata";
		
		System.out.println("En la frase hay " + numeroEspacios(frase) + " espacios");

	}
	
	public static int numeroEspacios(String frase){
		char[] fraseChar = frase.toCharArray();
		int contador = 0;

		for (int i = 0; i < fraseChar.length; i++) {

			if (fraseChar[i] == ' ') {
				contador++;

			}

		}
		return contador;
		
	}

}
