package OOP.INTERFACES;

public class Fish implements Prey, Preditor{
    @Override
    public void flee(){
        System.out.println("The fish is swimming away");

    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }

}
