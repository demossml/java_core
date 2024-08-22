package oop.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

//        dog.eat();
//        cat.eat();

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;


//        for (Animal animal : animals) {
//            animal.eat();
//        }

        feetTowAnimals(dog, cat);
    }

    public static void feetTowAnimals(Animal animal1, Animal animal2){
        animal1.eat();
        animal2.eat();
    }
}
