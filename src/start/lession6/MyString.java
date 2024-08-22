package lession6;

public class MyString {
    public static void main(String[] args) {
        String text = new String("\tHi") ;
        String text2 = new String("Hi") ;
        //Для сровнения text и text2 преминяем метод text.equals(text2)
        System.out.println(text.equals(text2));

        System.out.println(text);
        System.out.println(text2);


    }
}