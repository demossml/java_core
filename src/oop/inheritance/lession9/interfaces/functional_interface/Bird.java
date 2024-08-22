package oop.inheritance.lession9.interfaces.functional_interface;

public class Bird implements Sounding{
    @Override
    public void makeSound() {
        System.out.println("Птица поет");
    }
}
