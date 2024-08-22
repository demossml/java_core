package oop.nested_classes;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human("21AA", "342BB",
                PassportType.FOREIGN, 285);
//        Human.Passport passport = new Human.Passport("21AA", "342BB",
//                PassportType.FOREIGN);

//        human.setPassport(human);
        System.out.println(human);




    }
}
