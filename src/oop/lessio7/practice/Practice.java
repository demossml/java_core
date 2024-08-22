package oop.lessio7.practice;

import oop.lessio7.Cat;

public class Practice {
    public static void main(String[] args) {
        Car zvorykingCar = new Car("ZvorykinCar");
//        zvorykingCar.investigateSpeed100();

        Car superCar = new Car("SuperCar", 400);
//        superCar.investigateSpeed100();

        Garage garage = new Garage();

        garage.setCar1(zvorykingCar);
        garage.setCar2(superCar);
        garage.getInfoAboutCars();
    }
}
