import java.util.Scanner;

public class StairLengthCalculator {
    public static double EjercicioJava03(double x, double alpha) {
        double alphaRadians = Math.toRadians(alpha);
        
        
        double y = x * Math.sin(alphaRadians);
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la altura de la escalera (x): ");
        double x = scanner.nextDouble();

        System.out.print("Ingresa el ángulo en grados (α): ");
        double alpha = scanner.nextDouble();

        double stairLength = calculateStairLength(x, alpha);
        System.out.println("La longitud de la escalera es: " + stairLength);

        scanner.close();
    }
}
