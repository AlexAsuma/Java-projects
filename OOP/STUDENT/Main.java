package OOP.STUDENT;
import java.util.Scanner;


public class Main{
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you wanna log in the system?: ");
        int studentNo = scanner.nextInt();
        scanner.nextLine();

        Students[] students = new Students[studentNo];

        for(int i = 0; i < students.length; i++) {
            System.out.println("\n********** Student " + (i + 1) + "************");

            String name = "";
            while (true) {
                System.out.print("Enter the name of the student: ");
                String tempName = scanner.nextLine();

                EmptyCheck checkname = new EmptyCheck(tempName);
                if (checkname.isValid) {
                    name = tempName;
                    break;
                } else {
                    System.out.println("ERROR: Name field cannot be left empty!");
                }

            }

            String regNO = "";
            while (true) {
                System.out.print("Enter the regNo of the student(no spaces): ");
                String tempRegNO = scanner.next();
                scanner.nextLine();

                RegNoCheck regCheck = new RegNoCheck(tempRegNO);
                if (!regCheck.isValid) {
                    System.out.println("INVALID FORMAT!! Use format: CODE/NUMBER/YEAR (eg., S13/12345/24)");
                    continue;
                } if(!isRegNoUnique(students, tempRegNO, i)) {
                    System.out.println("ERROR: Registration number '" + tempRegNO + "' is already assigned!");
                    continue;
                }
                regNO = tempRegNO;
                break;
            }

            String course = "";
            while (true) {
                System.out.print("Enter the course that the student is doing: ");
                String tempCourse = scanner.nextLine();

                EmptyCheck checkCourse = new EmptyCheck(tempCourse);
                if (checkCourse.isValid) {
                    course = tempCourse;
                    break;
                } else {
                    System.out.println("ERROR: Course field Cannot be left empty!");
                }
            }

            int marks = 0;
            while(true){
                System.out.print("Enter the Marks of the student: ");
                int tempMarks = scanner.nextInt();
                scanner.nextLine();

                MarksCheck marksCheck = new MarksCheck(tempMarks);
                if(marksCheck.isValid){
                    marks = tempMarks;
                    break;
                }
                else{
                    System.out.println("The marks you've entered is invalid, Please try again\n(marks = 0-100)");

                }

            }

            students[i] = new Students(name, regNO, course, marks);

        }
        System.out.println("\n**************** STUDENTS RECORDS *****************");
        for(Students student : students){
            student.displayDetails();
            System.out.println("\n==================================================");
        }

        scanner.close();
    }
    private static boolean isRegNoUnique(Students[] students, String regNO, int currentCount){
        for(int j =0; j< currentCount; j++){
            if(students[j] != null && students[j].regNO.equalsIgnoreCase(regNO)){
                return false;
            }
        }
        return true;
    }
}