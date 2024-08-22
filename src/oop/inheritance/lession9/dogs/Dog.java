package oop.inheritance.lession9.dogs;

import oop.inheritance.lession9.Alive;

public abstract class Dog extends Alive {

    protected final int  countLegs = 4;

    public int countTeeth;

    public static final String LATIN_NAME = "Canis familiaris";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark() {
        System.out.println("Собака громко лает");
    }

    public void beAngry(){
        System.out.println("Собака рычит");
    }

    public void eat(){
        System.out.println("Собака ест");
    }

    public abstract void run();
}
