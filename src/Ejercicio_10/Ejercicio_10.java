package Ejercicio_10;

public class Ejercicio_10 {

	public static void main(String[] args) {
	String frase =  " Hola papa";
	
	System.out.println(frasef(frase));
	
	}
	public static String frasef(String frase){
		
		String frase2 = "mama";
		
		frase = frase.replaceAll("papa", frase2);
	return frase;  
	}

	
}
