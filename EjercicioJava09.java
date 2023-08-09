import java.util.Scanner;

public class EjercicioJava09 {
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        int maxNumber = findMax(num1, num2);

        System.out.println("El mayor de los dos números es: " + maxNumber);

        scanner.close();
    }
}
