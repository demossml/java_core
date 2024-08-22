package oop.class_object.equals_hashcode_practise;

public class Task {
    public static void main(String[] args) {
        User user1 = new User("Di", "12345");
        User user2 = new User("Di", "34579");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user1.equals(user2));
    }


}
