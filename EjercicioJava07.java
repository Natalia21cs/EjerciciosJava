import java.util.Scanner;

public class EjercicioJava07 {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    public static double calculateSlope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingresa la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        double slope = calculateSlope(x1, y1, x2, y2);

        System.out.println("La distancia entre los dos puntos es: " + distance);
        System.out.println("La pendiente de la recta que une los dos puntos es: " + slope);

        scanner.close();
    }
}
