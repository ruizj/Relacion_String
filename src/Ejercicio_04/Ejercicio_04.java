package Ejercicio_04;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "El bb es un riogordeño";
		
		System.out.println(contiene(frase));
		
	}

	public static boolean contiene (String frase){
		
		boolean contiene = false;
		frase = frase.toLowerCase();
		char[] array = frase.toCharArray();
		char caracter = 'a';
		
		for(int i = 0 ; i <array.length; i++){
			if(array[i] == caracter){
				contiene=true;
			}
			
		}
		return contiene;
		
		
	}
}
