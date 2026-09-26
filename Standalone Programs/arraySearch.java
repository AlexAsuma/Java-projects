import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = { 1, 5, 8, 9, 3, 7, 2 };
        String[] fruits = { "Apple", "Orange", "Banana" };
        boolean isFound = false;

        System.out.println("Enter a fruit to search for");
        String target = scanner.nextLine().toUpperCase();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].toUpperCase().equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }

        }
        if (!isFound) {
            System.out.println("Element not found in the array");
        }
        scanner.close();

    }
}
