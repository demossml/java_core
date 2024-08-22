package oop.lessio8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car bmw = new Car("BMW");
        System.out.println("Количество машин: " + Car.countCars);

        Car.printBrands();
        System.out.println(Car.BMW_INFO);

        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTION));

    }
}
