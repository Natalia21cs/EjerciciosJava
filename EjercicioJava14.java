import java.util.Scanner;

public class EjercicioJava14 {
    public static String findElderSibling(String name1, int age1, String name2, int age2, String name3, int age3) {
        if (age1 >= age2 && age1 >= age3) {
            return name1;
        } else if (age2 >= age1 && age2 >= age3) {
            return name2;
        } else {
            return name3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del primer hermano: ");
        String name1 = scanner.nextLine();
        System.out.print("Ingresa la edad del primer hermano: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();  // Consume la nueva línea después de nextInt

        System.out.print("Ingresa el nombre del segundo hermano: ");
        String name2 = scanner.nextLine();
        System.out.print("Ingresa la edad del segundo hermano: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();  // Consume la nueva línea después de nextInt

        System.out.print("Ingresa el nombre del tercer hermano: ");
        String name3 = scanner.nextLine();
        System.out.print("Ingresa la edad del tercer hermano: ");
        int age3 = scanner.nextInt();

        String elderSibling = findElderSibling(name1, age1, name2, age2, name3, age3);

        System.out.println("El hermano mayor es: " + elderSibling);

        scanner.close();
    }
}
