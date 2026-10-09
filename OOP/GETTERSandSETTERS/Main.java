package OOP.GETTERSandSETTERS;

public class Main {
    //They help protect objects and add rules for accessing or modifying then.
    //GETTERS = Methods that make a field READABLE
    //SETTERS = Methods that make a field WRITEABLE
    static void main(String[] args) {
        Car car = new Car("Toyota", "Black", 50000);

        car.setColor("Pink");
        car.setPrice(20000 );
        System.out.println(car.toString());

    }

}
