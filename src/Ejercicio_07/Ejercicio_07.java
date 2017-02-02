package Ejercicio_07;

public class Ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "El bb es un riogordeño";
		
		System.out.println(espacio(frase));
		
	}
	public static String espacio(String frase){
		
		String espacio = "";
		char[] frasecaracter =  frase.toCharArray();
		
		for(int i = 0; i < frasecaracter.length; i++){
			
			if( frasecaracter[i] != ' '){
				
				espacio = espacio + frasecaracter[i];
				
			}
			
		}
		return espacio;
		
		
	}
	
}
