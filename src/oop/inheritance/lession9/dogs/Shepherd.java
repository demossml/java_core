package oop.inheritance.lession9;

public class Shepherd extends Dog {

    public Shepherd() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Собака бижит медлено");

    }

    @Override
    public void breath() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void bark(){
        System.out.println("Овчарка громко лаит");
    }

    @Override
    public void beAngry(){
        System.out.println("Овчарка увидела чужого человека");
        super.beAngry();
        System.out.println("Овчарка успокоилась");
    }
}
