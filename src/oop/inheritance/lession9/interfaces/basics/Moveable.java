package oop.inheritance.lession9.interfaces.basics;

public interface Moveable {

    void move();

    default void back() {
        System.out.println("Возвращаемся назад");
    }
}
