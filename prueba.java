import java.util.Scanner;
import java.lang.Math;

class practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[3];
        int neg = 0;
        int pos = 0;
        int imp = 0;
        int sum_imp=0;
        float prom_imp=0;

        System.out.println("Teclea 15 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0 && numeros[i] % 2 == 0) {
                double raiz = Math.sqrt(numeros[i]);
                System.out.printf("Raíz cuadrada de %d es: %.2f%n", numeros[i], raiz);
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            }

            if (numeros[i] % 2 != 0) {
                sum_imp += numeros[i];
                imp++;
            }
        }
        prom_imp = (float) sum_imp / imp;

        System.out.println("Cantidad de numeros negativos: " + neg);
        System.out.println("Promedio de numeros impares: " + prom_imp);
    }
}