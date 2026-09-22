public class TwoDArrays {
    public static void main(String args[]) {
       // String[] fruits = { "Apple", "orange", "Banana" };
        //String[] vegetables = { "Potato", "Onion", "Carrot" };
        //String[] meats = { "Chicken", "pork", "beef", "fish" };

        //String[][] groceries = { fruits, vegetables, meats }; 
          //ALL OF THAT OR
        String[][] groceries = { { "Apple", "orange", "Banana" },
                { "Potato", "Onion", "Carrot" },
                { "Chicken", "pork", "beef", "fish" }

        };

        groceries [1][0] = "celery";
    

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");

            }
            System.out.print("\n");

        }

    }

}
