package oop.inheritance.lession9;

public class Runner {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);



        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.println(shepherd.countTeeth);
        shepherd.beAngry();

        Terrier terrier = new Terrier();
        System.out.println(terrier.countTeeth);


        System.out.println(shepherd.countLegs);


    }
}
