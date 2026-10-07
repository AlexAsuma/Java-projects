package OOP.INTERFACES;

public class Main
{
    static void main(String[] args) {
        //Interface = A blueprint for a class that specifies a set of abstract methods
        //              that implementing classes MUST definue.
        //              Supports multiple inheritance-like behavior.

Rabbit rabbit = new Rabbit();
rabbit.flee();

Hawk hawk = new Hawk();
hawk.hunt();

Fish fish = new Fish();
fish.flee();
fish.hunt();
    }
}
