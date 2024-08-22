package oop.record;

public class RecordExample {
    public static void main(String[] args) {
        Human human = new Human(1982, "Иван", "Иванович", "Иванов");
        System.out.println(human);
        NewHumanRecord newHumanRecord = new NewHumanRecord(1982, "Иван", "Иванович", "Иванов");
        System.out.println(newHumanRecord);
        newHumanRecord.getInfo();
    }
}
