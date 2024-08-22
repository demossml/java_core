package oop.inheritance.lession9;

public class Terrier extends Dog {

    public Terrier() {
        super(27);
    }

    @Override
    public void run() {
        System.out.println("Терьер бижит");
    }

    @Override
    public void breath() {
        System.out.println("Терьер дышит");
    }
}
