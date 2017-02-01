package Ejercicio_10;

public class Ejercicio_10 {

	public static void main(String[] args) {
	String frase =  " Hola papa";
	
	System.out.println(frase2(frase));
	
	}
	public static String frase2(String frase){
		
		String frase2 = "mama";
		
		frase = frase.replaceAll("papa", frase2);
	return frase;	
	}

	
}
