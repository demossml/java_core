package oop.inheritance.lession9.interfaces.basics;

public class Car implements Moveable {

    public void move() {
        System.out.println("Машина едит");
    }

    @Override
    public void back() {
        System.out.println("Машина возвращается назад");;
    }
}
