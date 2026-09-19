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
                case 2 -> System.out.println("Deposit");
                case 3 -> System.out.println("Withdraw");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!!");

            }
        }
        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.printf("$%,.f\n", balance);

    }
}
