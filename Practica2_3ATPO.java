import java.util.Scanner;
public class Practica2_3ATPO {
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static String clasificarTriangulo(double ab, double bc, double ca) {
        if (Math.abs(ab - bc) < 0.001 && Math.abs(bc - ca) < 0.001) {
            return "Es un triangulo Equilatero";
        } else if (Math.abs(ab - bc) < 0.001 || Math.abs(bc - ca) < 0.001 || Math.abs(ca - ab) < 0.001) {
            return "Es un triangulo Isoceles";
        } else {
            return "Es un triangulo Escaleno";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe las coordenadas del punto A:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Escribe las coordenadas del punto B:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        System.out.println("Escribe las coordenadas del punto C:");
        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();

        double ladoAB = calcularDistancia(x1, y1, x2, y2);
        double ladoBC = calcularDistancia(x2, y2, x3, y3);
        double ladoCA = calcularDistancia(x3, y3, x1, y1);

        String tipoTriangulo = clasificarTriangulo(ladoAB, ladoBC, ladoCA);

        System.out.printf("Lado AB = %.2f%n", ladoAB);
        System.out.printf("Lado BC = %.2f%n", ladoBC);
        System.out.printf("Lado CA = %.2f%n", ladoCA);
        System.out.println(tipoTriangulo);

        scanner.close();
    }
}