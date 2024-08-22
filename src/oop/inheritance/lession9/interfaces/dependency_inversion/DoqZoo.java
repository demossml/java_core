package oop.inheritance.lession9.interfaces.dependency_inversion;

public class DoqZoo {
    private Dog dog;
    private Dog dog1;

    public DoqZoo(Dog poodle, Dog dog1) {
        System.out.println("Конструктор для любых собак");
        this.dog = poodle;
        this.dog1 = dog1;
    }

    public DoqZoo(Poodle poodle, Shepherd shepherd){
        System.out.println("Конструктор для пуделя и овчарки");

        this.dog = poodle;
        this.dog1 = shepherd;
    }
}
