package oop.inheritance.lession9.interfaces.interface_segregation;

public class Airplane implements Flyable, Drivable{
    @Override
    public void fly() {
        System.out.println("Самолет летит");

    }

    @Override
    public void drive() {
        System.out.println("Самолет едут");
    }
}
