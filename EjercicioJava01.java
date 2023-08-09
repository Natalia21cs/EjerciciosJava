
import java.util.Scanner;

public class EjercicioJava01 {
    public static double calculateFunctionValue(double x, double y) {
        return x * x + 2 * x * y + y * y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de x: ");
        double x = scanner.nextDouble();

        System.out.print("Ingresa el valor de y: ");
        double y = scanner.nextDouble();

        double result = calculateFunctionValue(x, y);
        System.out.println("El valor de la función es: " + result);

        scanner.close();
    }
}
