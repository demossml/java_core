package start.lession6;

public class TextBlock {
    public static void main(String[] args) {
//        String text = "Привет как тебя зовут?";
        String name1 = "Дмитрий";
        String name2 = "Даша";
        String text = """
                Привет, как тебя зовут?
                Меня зовут %s. А тебя?
                Меня зовут %s.
                """.formatted(name1, name2);
        System.out.println(text);
    }
}
