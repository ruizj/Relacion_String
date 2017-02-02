package Ejercicio_05;

public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = 'j';
		int cantidad = 2;
	
		System.out.println(frase(caracter,cantidad));
	
	}

	public static String frase(char caracter, int cantidad){
		
		String frase = "";
		
		for(int i = 0; i < cantidad ; i++){
			
			frase = frase + caracter;
			
			
		}
		
		return frase;
	}
}
