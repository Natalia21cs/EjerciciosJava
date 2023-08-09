import java.util.Scanner;

public class EjercicioJava04 {
    public static double calculateRentExpense(double salary) {
        return 0.4 * salary; // 40% of the salary for rent
    }

    public static double calculateFoodExpense(double salary) {
        return 0.15 * salary; // 15% of the salary for food
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el sueldo de Pedro: ");
        double salary = scanner.nextDouble();

        double rentExpense = calculateRentExpense(salary);
        double foodExpense = calculateFoodExpense(salary);

        double remainingMoney = salary - rentExpense - foodExpense;

        System.out.println("Gasto en arriendo: " + rentExpense);
        System.out.println("Gasto en comida: " + foodExpense);
        System.out.println("Dinero restante: " + remainingMoney);

        scanner.close();
    }
}
