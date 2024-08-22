package oop.record;

public record NewHumanRecord( int birthYear, String name,
                              String surname, String lastname) {

    public  NewHumanRecord {
        System.out.println("Hello from record");
    }

    public  void getInfo() {
        System.out.println(name + " " + lastname);
    }
}
