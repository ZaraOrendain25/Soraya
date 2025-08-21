package arreglos;
import java.util.Scanner;

public class Estandares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] edades = new int[6];
		
		Scanner captura = new Scanner(System.in);
		//llenar el arreglo
		for(int i = 1; i < edades.length; i++ ) {
			System.out.println("Dame la edad: " +i);
			edades[i] = captura.nextInt();
		}
		//iterar el arreglo edades
		int x = 0;
		System.out.println("Arreglo de: ");
		System.out.println(edades.length);
		while (x < edades.length) {
			System.out.println("Valor de x:" + edades[x]);
			x++;
		}
		
	}

}
