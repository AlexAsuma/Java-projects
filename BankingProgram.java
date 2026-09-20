//UNFINISHED
import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("****************************************");
            System.out.println("************BANKING PROGRAM*************");
            System.out.println("****************************************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************************************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> deposit(balance);
                case 3 -> System.out.println("Withdraw");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!!");

            }

            /*
             * switch (choice) {
             * case 1: {
             * showBalance(balance);
             * break;
             * }
             * case 2: {
             * deposit(balance);
             * break;
             * }
             * case 3: {
             * break;
             * 
             * }
             * case 4: {
             * break;
             * }
             * default: {
             * System.out.println("INVALID CHOICE!!");
             * 
             * }
             * }
             */
        }
        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.printf("$%,.f\n", balance);

    }

    static void deposit(double balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you would like to deposit: ");
        double amountDeposited = scanner.nextDouble();
        double newBalance = balance + amountDeposited;
        System.out.printf("Amount deposited successfully\n New balance = %,.2f", newBalance);

        scanner.close();

    }

    static void withdraw() {

    }
}
