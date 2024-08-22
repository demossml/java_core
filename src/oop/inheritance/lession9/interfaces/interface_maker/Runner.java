package oop.inheritance.lession9.interfaces.interface_maker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if (bird instanceof Alive){
            System.out.println("Этот обек живой!");
        }
        if (airplane instanceof Alive){
            System.out.println("Этот обек живой!");
        }else {
            System.out.println("Этот обьект не живой!");
        }
    }
}
