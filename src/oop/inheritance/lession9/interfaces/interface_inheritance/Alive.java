package oop.inheritance.lession9.interfaces.interface_inheritance;

public interface Alive  extends  Eatable, Moveable{

    @Override
    default void eat() {
        Eatable.super.eat();
    }
}
