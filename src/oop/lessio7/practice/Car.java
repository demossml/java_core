package oop.lessio7.practice;

import oop.lessio7.Cat;

public class Car {
    private String brand;
    private int maxSpeed = 220;

    public Car(String brand){
        this.brand = brand;

    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void investigateSpeed100() {
        double speed = 110d / (this.maxSpeed / 20d);
        System.out.printf("Скорость разгона до 100км/ч: %s\n", speed);
    }

    public String getBrand() {
        return brand;
    }
}
