import java.util.Scanner;

public class WeightConversionProgram {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight, newWeight;
        int choice;

        // welcome message
        System.out.println("********************************************");
        System.out.println("**********WEIGHT CONVERSION PROGRAM*********");
        System.out.println("********************************************");

        // prompt for user choice
        System.out.println("\nChoice 1: convert lbs to kgs");
        System.out.println("Choice 2: convert kgs to lbs");
        System.out.print("\nChoose an option: ");
        choice = scanner.nextInt();

        switch (choice) {
            // option 1 convert lbs to kgs
            case 1: {
                System.out.print("Enter the weight in lbs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("The new weight in kgs is: %,.2f kgs", newWeight);
                break;
            }
            // option 2 convert kgs to lbs

            case 2: {
                System.out.print("\nEnter the weight in kgs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("The new weight in lbs is: %,.2 lbs", newWeight);
                break;
            }
            // else give an error
            default:
                System.out.println("ERROR!! Please choose the options provided above ");
                break;

        }

        scanner.close();

    }
}
