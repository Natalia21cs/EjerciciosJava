import java.util.Scanner;

public class EjercicioJava08 {
    public static int calculateNumberOfClassrooms(int totalStudents, int classroomCapacity) {
        return (int) Math.ceil((double) totalStudents / classroomCapacity);
    }

    public static int calculateNumberOfFloors(int totalClassrooms, int classroomsPerFloor) {
        return (int) Math.ceil((double) totalClassrooms / classroomsPerFloor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número total de estudiantes en la universidad: ");
        int totalStudents = scanner.nextInt();

        System.out.print("Ingresa la capacidad de un salón: ");
        int classroomCapacity = scanner.nextInt();

        System.out.print("Ingresa el número de salones por piso: ");
        int classroomsPerFloor = scanner.nextInt();

        int totalClassrooms = calculateNumberOfClassrooms(totalStudents, classroomCapacity);
        int totalFloors = calculateNumberOfFloors(totalClassrooms, classroomsPerFloor);

        System.out.println("El número total de salones necesarios es: " + totalClassrooms);
        System.out.println("El número total de pisos del edificio será: " + totalFloors);

        scanner.close();
    }
}
