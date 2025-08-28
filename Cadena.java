package arreglos;
import java.util.*;

public class Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres; // declaracion de un arreglo
		String[] estados = new String[5]; 
		
		estados[0] = "Jalisco";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos elementos quieres almacenar? ");
		int elementos = sc.nextInt();
		String no;
		sc.nextLine();
		nombres = new String[elementos];
		for(int i = 0; i < nombres.length; i++) {
			
			System.out.println("Nombre: " + i);
			no = sc.nextLine();
			nombres[i] = no;
			sc.nextLine();
		}
		
		/*for (String nombre : nombres) {
			System.out.println(nombre);
			
		}*/
		
		System.out.println("tamaño: "+nombres.length);
		
		for(int n = 0; n < nombres.length; n++ ) {
			System.out.println(nombres[n]);
		}

		
	}

}
