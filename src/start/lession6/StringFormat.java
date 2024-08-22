package start.lession6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Дмиьрий";
        int age = 30;
        //String phrase = "Меня зовут " + name + "мне " + age + " лет.";
        String phrase = String.format("Меня зовут %s мне %d лет.", name, age);
        System.out.printf("Меня зовут %s мне %d лет.", name, age);
    }
}
