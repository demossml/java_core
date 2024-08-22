package oop.lessio7;

import oop.lessio7.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("black", 10, "Dmitry");
//        cat.color = "Red";
//        System.out.println(cat.color);
//
//        cat.destroySofa(cat.ownerName);
//        System.out.println(cat.hunt(true, true));
//        cat.feed("Рыбу", "Корм", "Воду");
        Dog dog = new Dog("Мухтар", -32, "Дмитрий");
//        dog.setWeight(-1);
//        System.out.println(dog);
//        System.out.println(dog.getOwner());
//        Dog dog1 = new Dog();
//        System.out.println(dog1);
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();

//

    }
}
