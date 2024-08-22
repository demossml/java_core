package oop.inheritance.lession9.interfaces.interface_inheritance;

public interface Eatable {
    default void eat() {
        System.out.println("Обект ест");
    };
}
