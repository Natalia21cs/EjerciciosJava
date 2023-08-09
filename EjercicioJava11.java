import java.util.Scanner;

public class EjercicioJava11 {
    public static int getTensDigit(int number) {
        return number / 10;
    }

    public static int getUnitsDigit(int number) {
        return number % 10;
    }

    public static String convertDigitToRoman(int digit) {
        if (digit == 0) {
            return "";
        } else if (digit <= 3) {
            return "I".repeat(digit);
        } else if (digit == 4) {
            return "IV";
        } else if (digit <= 8) {
            return "V" + "I".repeat(digit - 5);
        } else {
            return "IX";
        }
    }

    public static String convertTensToRoman(int tensDigit) {
        if (tensDigit == 0) {
            return "";
        } else if (tensDigit <= 3) {
            return "X".repeat(tensDigit);
        } else if (tensDigit == 4) {
            return "XL";
        } else if (tensDigit <= 8) {
            return "L" + "X".repeat(tensDigit - 5);
        } else {
            return "XC";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero entre 1 y 99: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 99) {
            int tensDigit = getTensDigit(number);
            int unitsDigit = getUnitsDigit(number);

            String tensRoman = convertTensToRoman(tensDigit);
            String unitsRoman = convertDigitToRoman(unitsDigit);

            System.out.println("El número " + number + " en números romanos es: " + tensRoman + unitsRoman);
        } else {
            System.out.println("Número fuera del rango permitido.");
        }

        scanner.close();
    }
}
