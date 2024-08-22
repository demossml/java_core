package oop.inheritance.lession9.dogs;

public class Poodle extends Dog {

    public Poodle(){
        super(36);
    }

    public void run() {
        System.out.println("Собака бижит медлено");
    }

    @Override
    public void breath() {
        System.out.println("Пудель дышит");
    }

}
