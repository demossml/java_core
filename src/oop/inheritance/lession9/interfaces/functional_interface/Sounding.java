package oop.inheritance.lession9.interfaces.functional_interface;

@FunctionalInterface
public interface Sounding {
    void makeSound();
    default void doSomething(){
        System.out.println("Делаю что то");
    }
}
