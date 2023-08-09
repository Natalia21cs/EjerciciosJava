import java.util.Scanner;

public class EjercicioJava12 {
    public static String getNextDay(String currentDay) {
        String[] daysOfWeek = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equalsIgnoreCase(currentDay)) {
                int nextIndex = (i + 1) % daysOfWeek.length;
                return daysOfWeek[nextIndex];
            }
        }

        return "Día no válido";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un día: ");
        String currentDay = scanner.nextLine();

        String nextDay = getNextDay(currentDay);

        System.out.println("El día de mañana es: " + nextDay);

        scanner.close();
    }
}
