package oop.exceptions;

public class Car {
    private boolean isBroken;

    public Car(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void start() throws CarIsBrokenException {
        if (isBroken) {
            throw new CarIsBrokenException("Машина не раюотает");
        }
        System.out.println("Машина успешно стартавала");
    }
}
