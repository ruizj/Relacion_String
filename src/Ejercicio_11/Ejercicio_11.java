package Ejercicio_11;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "El bb es un riogordeño bb";
		String subcadena = "bb";
		
		System.out.println(asterisco(frase,subcadena));

	}
	
	public static String asterisco(String frase, String subcadena){
		String subcadena2="";
		String cadena2="";
		
		char sub[] = subcadena.toCharArray();
		 sub[0] = '*';
		
		subcadena2 =  String.valueOf(sub);
		
		 cadena2 = frase.replaceAll(subcadena, subcadena2);
	
		 return cadena2;
	}

}
