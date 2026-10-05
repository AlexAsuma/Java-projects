package OOP.Inheritance;

public class Main {
    public static void main(String args[]){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();
        Animal animal = new Animal();

        System.out.println(cat.isAlive);
        plant.photosynthesize();

        System.out.println(cat.lives);


    }
    
}
