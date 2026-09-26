import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n*******************************************");
            System.out.println("*************** BANKING PROGRAM ***********");
            System.out.println("*******************************************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*******************************************");
            System.out.print("Enter your choice (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("INVALID INPUT: Please enter a number between 1 and 4.");
                scanner.nextLine(); // Clear invalid token
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(scanner);
                case 3 -> balance -= withdraw(scanner, balance);
                case 4 -> {
                    System.out.println("Thank you for using our banking services!");
                    isRunning = false;
                }
                default -> System.out.println("INVALID CHOICE");
            }
        }

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("BALANCE = $%,.2f\n", balance);
    }

    static double deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0.");
            return 0;
        }

        System.out.printf("Amount deposited successfully!\nNew balance = $%,.2f\n", amount);
        return amount;
    }

    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return 0;
        } else if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }

        System.out.println("WITHDRAW SUCCESSFUL");
        return amount;
    }
}