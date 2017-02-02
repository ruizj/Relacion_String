
package Ejercicio_06;
import java.util.*;
public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "El ala bb es un riogordeño";
		
		System.out.println("Numero de palabras en la fras: " + cantidad(frase));
		
	}
	public static int cantidad(String frase){
		
		int cantidad = 0;
		StringTokenizer st = new StringTokenizer(frase);
		cantidad =st.countTokens();
	return cantidad;
	
	}
	
}
