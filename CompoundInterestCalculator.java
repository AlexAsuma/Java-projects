import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        // compound interest calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("\n***********************************************************************");
        System.out.println("*************WELCOME TO THE COMPOUND INTEREST CALCULATOR***************");
        System.out.println("***********************************************************************");

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate in %: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d is: $%,.2f\n", years, amount);

        System.out.println("***********************************************************************");
        scanner.close();
    }
}