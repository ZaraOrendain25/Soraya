package Ttipos_variables;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// comentarios
		/* comentarios
		 * en mas de una linea
		 */
		int numero, edad, caso = 12; //variables enteras
		char sexo = 'f';  //almacena un solo caracter, no es lo mismo un string que un caracter
		//va en comillas simples en caracter
		boolean flag = true; //variables logicas false/true
		double precio = 45.4; //decimanles (flotante, tamaño pequeño)
		float cantidad =77.7f; //decimales (flotante, tamaño pequeño) se agrega f al final del numero si se pone, si no solo se declara
		String nombre = "Zara"; //variable  primitiva de tipo clase (se escribe en mayuscula la S siempre) aqui se usan comillas dobles para introducir el dato
		
		System.out.println("Hola " + precio);
		System.out.println("Hola " + cantidad + " Total");
		
		Scanner captura = new Scanner(System.in); 
		while (flag) {
		
			System.out.println("Selecciona MENU una opcion");
			System.out.println("Suma 1");
			System.out.println("Resta 2");
			System.out.println("Salir 3");
			int op = captura.nextInt();
			
			int result, num1, num2;
			
			
			switch(op) {
				case 1: 
					System.out.println("Valor 1");
					num1 = captura.nextInt();
					System.out.println("Valor 2");
					num2 = captura.nextInt();
					result = num1+num2;
					System.out.println("Resultado: " +result);
					break;
				case 2: 
					System.out.println("Valor 1");
					num1 = captura.nextInt();
					System.out.println("Valor 2");
					num2 = captura.nextInt();
					result = num1-num2;
					System.out.println("Resultado: " +result);
					break; 
				case 3:
					flag = false;
					break;
				
			}
			
		}
		

	}

}
