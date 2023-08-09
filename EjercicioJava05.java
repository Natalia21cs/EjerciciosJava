import java.util.Scanner;

public class EjercicioJava05 {
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateRingArea(double outerRadius, double innerRadius) {
        double outerArea = calculateCircleArea(outerRadius);
        double innerArea = calculateCircleArea(innerRadius);
        return outerArea - innerArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio grande (R): ");
        double outerRadius = scanner.nextDouble();

        System.out.print("Ingresa el radio pequeño (r): ");
        double innerRadius = scanner.nextDouble();

        double ringArea = calculateRingArea(outerRadius, innerRadius);

        System.out.println("El área de la corona circular es: " + ringArea);

        scanner.close();
    }
}
