package oop.inheritance.lession9.interfaces.interface_inheritance;

public interface Moveable {
    void move();

    default void eat(){
        System.out.println("Движущийся обьект ест");
    };
}
