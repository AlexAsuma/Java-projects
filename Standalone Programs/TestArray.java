public class TestArray {
    public static void main(String[] args) {
        double[] myList = { 4.0, 1.9, 2.9, 3.4, 3.5 };
        // print all the array elements

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

        // summing all elements

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.printf("Total = %,.2f\n", total);

        // finding the largest element
        double largest = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > largest) {
                largest = myList[i];
            }
        }
        System.out.println("Largest = " + largest);

    }
}
