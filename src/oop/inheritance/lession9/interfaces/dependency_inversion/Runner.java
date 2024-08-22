package oop.inheritance.lession9.interfaces.dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        Terier terier = new Terier();

        DoqZoo doqZoo = new DoqZoo(terier, shepherd);

        DoqZoo doqZoo1 = new DoqZoo(poodle, shepherd);
    }
}
