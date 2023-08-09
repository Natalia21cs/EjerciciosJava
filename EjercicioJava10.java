import java.util.Scanner;

public class EjercicioJava10 {
    public static int performOperation(int num1, int num2, String operator) {
        int result = 0;
        
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "**":
                result = (int) Math.pow(num1, num2);
                break;
            default:
                System.out.println("Operador inválido.");
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el operador aritmético (+, -, *, /, %, **): ");
        String operator = scanner.next();

        int result = performOperation(num1, num2, operator);

        System.out.println("El resultado de la operación es: " + result);

        scanner.close();
    }
}
