import java.util.Scanner;

public class EjercicioJava06 {
    public static double calculateRectangleArea(double base, double height) {
        return base * height;
    }

    public static double calculateHypotenuse(double side1, double side2) {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del lado A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Ingresa la longitud del lado B: ");
        double sideB = scanner.nextDouble();

        System.out.print("Ingresa la longitud del lado C: ");
        double sideC = scanner.nextDouble();

        double perimeter = calculatePerimeter(sideA, sideB, sideC);

        // Calcular la hipotenusa para usarla en el cálculo del área del triángulo
        double hypotenuse = calculateHypotenuse(sideA, sideB);

        System.out.print("Ingresa la altura del triángulo: ");
        double height = scanner.nextDouble();

        double triangleArea = calculateTriangleArea(sideC, height);

        System.out.println("El perímetro del terreno es: " + perimeter);
        System.out.println("El área del terreno es: " + triangleArea);

        scanner.close();
    }
}
