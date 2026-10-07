package OOP.TOSTRING;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //.toString() = method inherited from the Object class.
        //Used to return a string representation of an object.
        //By default, it returns a hash code as a unique identifier.
        //It can be overridden to provide meaningful details.
        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Toyota", "Lexus", 2027, "Black");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
