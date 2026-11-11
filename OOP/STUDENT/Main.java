package OOP.STUDENT;
import java.util.Scanner;
import java.io.Console;

public class Main{
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, regNO, course;
        int marks = 0;
        char grade;

        System.out.println("Enter the name of the student: ");
        name = scanner.nextLine();

        System.out.println("Enter the regNo of the student(no spaces): ");
        regNO = scanner.next();

        scanner.nextLine();

        System.out.println("Enter the course that the student is doing: ");
        course = scanner.nextLine();

        System.out.print("Enter the Marks of the student: ");
        int tempMarks = scanner.nextInt();

        MarksCheck marksCheck = new MarksCheck(tempMarks);
        boolean isValid = marksCheck.isValid;
        if(isValid){
            marks = tempMarks;
        }
        else{
            System.out.println("The marks you've entered is invalid, Please try again\n(marks = 0-100)");

        }
        CalcGrade calcGrade = new CalcGrade(marks);
        System.out.println(name + " " + regNO + " " + course + " " + marks + " " + calcGrade.grade);



        scanner.close();
    }
}