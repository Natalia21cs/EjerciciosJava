import java.util.Scanner;

public class EjercicioJava02 {
    public static int calculateBusesNeeded(int totalSeats, int numFatStudents, int numThinStudents) {
        int fatSeatsNeeded = numFatStudents * 2;
        int totalSeatsNeeded = fatSeatsNeeded + numThinStudents;
        
        int busesNeeded = (int) Math.ceil((double) totalSeatsNeeded / totalSeats);
        return busesNeeded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número total de sillas en el bus: ");
        int totalSeats = scanner.nextInt();

        System.out.print("Ingresa el número de estudiantes gordos: ");
        int numFatStudents = scanner.nextInt();

        System.out.print("Ingresa el número de estudiantes flacos: ");
        int numThinStudents = scanner.nextInt();

        int busesNeeded = calculateBusesNeeded(totalSeats, numFatStudents, numThinStudents);
        System.out.println("Se necesitan " + busesNeeded + " buses para llevar a todos los estudiantes al paseo.");

        scanner.close();
    }
}
