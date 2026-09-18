import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^, %)");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
            }
            case '^' -> result = Math.pow(num1, num2);
            case '%' -> result = num1 % num2;
            default -> {
                System.out.println("Invalid operator.");
                scanner.close();
                return;
            }
        }

        System.out.println("Result: " + result);

        

        scanner.close();
    }

}
