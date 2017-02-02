package Ejercicio_07;

public class Ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frasebb = "El bb es un riogordeño";
		
		System.out.println(espacio(frasebb));
		
	}
	public static String espacio(String frasebb){
		
		String espacio = "";
		char[] frasecaracter =  frasebb.toCharArray();
		
		for(int i = 0; i < frasecaracter.length; i++){
			
			if( frasecaracter[i] != ' '){
				
				espacio = espacio + frasecaracter[i];
				
			}
			
		}
		return espacio;
		
		
	}
	
}
