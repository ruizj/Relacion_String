package Ejercicio_02;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = " Hakuna Matata vive y se feliz, ningun problema debe hacerte sufrir, lo mas facil es saber vivir hakuna matata";

		System.out.println("Hay " + numeroVocales(frase) + " vocales en la frase.");
		
	}

	public static int numeroVocales(String frase) {
		frase = frase.toUpperCase();
		int contador=0;
		char array[] = frase.toCharArray();
		
		for(int i = 0; i < array.length; i++){
			if(array[i] == 'A' || array[i] == 'E'|| array[i] == 'I' || array[i] == 'O' || array[i] == 'U' ){
			contador++;	
				
			}
			
		}
		return contador;
		
	}

}
