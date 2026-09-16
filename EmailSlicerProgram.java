import java.util.Scanner;

public class EmailSlicerProgram {
    public static void main(String[] args) {
        // .substring() = A method used to extract a protion of a string
        // string.substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("Enter your email address: ");
        email = scanner.nextLine();

        if (email.contains("@") && !email.contains(" ")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            if (!domain.contains(".")) {
                System.out.println("The email domain must contain the '.' symbol");

            } else {
                System.out.println("Username = " + username);
                System.out.println("Domain = " + domain);

            }

        } else {
            System.out.println("Emails must contain the @ symbol and must not include any white spaces");
        }

        scanner.close();

    }
}
