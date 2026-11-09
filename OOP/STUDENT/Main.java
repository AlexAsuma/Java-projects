package OOP.STUDENT;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Marks = -1;
        boolean shouldContinue = false;
        do {
            System.out.println("Please enter the marks here: ");
            int tempMarks = scanner.nextInt();
            if (tempMarks < 0 || tempMarks > 100) {
                System.out.println("Invalid Marks");
                break;
            } else {
                Marks = tempMarks;
                shouldContinue = true;
            }

            calcGrade calcGrade = new calcGrade();

            System.out.println("Your grade is " + calcGrade.calcGrade(Marks));

        }while(shouldContinue);
        scanner.close();
    }
}
