import java.util.Scanner;

public class tempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp, newTemp;
        String unit;

        System.out.println("************************************************************* ");
        System.out.println("********WELCOME TO THE TEMPERATURE CONVERSION PROGRAM********");
        System.out.println("************************************************************* ");

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("The new temperature after conversion is %,.2f %s\n", newTemp, unit);
        scanner.close();
        System.out.println("*************************************************************");

    }
}