package oop.inheritance.lession9.interfaces.functional_interface;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Кошка меукает");
    }
}
