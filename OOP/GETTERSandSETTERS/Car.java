package OOP.GETTERSandSETTERS;

public class Car {
    private final String make;
    private String color;
    private int price;

        Car(String make, String color, int price){
            this.make = make;
            this.color = color;
            this.price = price;
        }

        //GETTERS
        String getMake(){
            return this.make;
        }

        String getColor(){
            return this.color;
        }

        int getPrice(){
            return this.price;
        }

        //SETTERS
        void setColor(String color){
            this.color = color;
        }

        void setPrice(int price){
            if(price < 0){
                System.out.println("WARNING!! The price cannot be negative");
            }
            else this.price = price;
        }


    @Override
    public String toString() {
        return "$" + price + " " + color + " " + make;
}
}
