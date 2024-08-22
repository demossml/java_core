package oop.lessio7.zoo;

import oop.lessio7.Cat;
import oop.lessio7.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed() {
        cat.feed("Рыбу");
        dog.feed("Мясо");

    }
}
