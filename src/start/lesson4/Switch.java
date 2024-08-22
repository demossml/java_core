package lesson4;

public class Switch {
    public static void main(String[] args) {

        int numberDay  = 2;

        switch (numberDay){
            case 1 -> System.out.println("Пн");
            case 2 -> System.out.println("Вт");
            default -> System.out.println("данные не верны");
        }

    }
}
