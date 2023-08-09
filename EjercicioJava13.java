import java.util.Scanner;

public class EjercicioJava13 {
    public static double calculateIncrease(double currentSalary) {
        if (currentSalary <= 800000) {
            return currentSalary * 0.1;
        } else if (currentSalary <= 1200000) {
            return currentSalary * 0.08;
        } else {
            return currentSalary * 0.05;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el sueldo actual del empleado: ");
        double currentSalary = scanner.nextDouble();

        double increase = calculateIncrease(currentSalary);

        double newSalary = currentSalary + increase;

        System.out.println("El aumento en el salario es: " + increase);
        System.out.println("El nuevo salario del empleado con el incremento incluido es: " + newSalary);

        scanner.close();
    }
}
