import java.util.Scanner;
import java.util.Random;

public class NoGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess, attempts = 0,

                min = 1,
                max = 100,
                randomNumber = random.nextInt(min, max + 1);

        System.out.println("*******************************************");
        System.out.println("***********NUMBER GUESSING GAME************");
        System.out.println("*******************************************");

        do {
            System.out.printf("Guess a number between %d-%d\n", min, max);
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("TOO LOW!! Try again");

            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH!!Try again");
            } else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }

        } while (guess != randomNumber);
        System.out.println("*******************************************");

        scanner.close();
    }
}