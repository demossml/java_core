package oop.inheritance.lession9.interfaces.task;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самалет летит");
    }
}
