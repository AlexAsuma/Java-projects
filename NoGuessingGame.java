import java.util.Scanner;
import java.util.Random;

public class NoGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess, attempts,
                randomNumber = random.nextInt(1, 11);

        System.out.println("*******************************************");
        System.out.println("***********NUMBER GUESSING GAME************");
        System.out.println("*******************************************");

        

        scanner.close();
    }
}