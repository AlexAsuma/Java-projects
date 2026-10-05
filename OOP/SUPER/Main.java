package OOP.SUPER;
//super refers to the parent class
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Patrick", "Spongebob");
        Student student = new Student("Sandy", "Squidward", 3.9);

        System.out.print("Enter the first name of the employee: ");
        String first = scanner.nextLine();

        System.out.print("Enter the Last name of the employee: ");
        String last = scanner.nextLine();

        System.out.print("Enter the salary of the employee: ");
        int salary = scanner.nextInt();


        Employee employee = new Employee(first, last,salary);


        employee.showSalary();


    }
}
