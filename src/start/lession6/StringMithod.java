package start.lession6;

import java.util.Arrays;

public class StringMithod {
    public static void main(String[] args) {
        String text = "Hello world!";
        //Перевод в верхний регистр
        //command+option+v для автомотической генирации имени переменной
        String upperCase = text.toUpperCase();
        System.out.println(upperCase);

        //Перевод в нижний регистр
        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);

        //Длина строки
        int length = text.length();
        System.out.println(length);

        //Есть ли в тексте другой текст?
        boolean hello = text.contains("hello");
        boolean loweHello = lowerCase.contains("hello");
        System.out.println(hello);
        System.out.println(loweHello);

        //Замена всех кусков текста(подстроки) на другой текст
        String replacedText = text.replaceAll("r",  "R");
        System.out.println(replacedText);

        // Повторить текст n раз
        String repeated = text.repeat(10);
        System.out.println(repeated);

        //Разбить стринг на масив String
        String[] strings = text.split(" ");
        System.out.println(Arrays.toString(strings));

        //Обеденить строки(конкатенация)
        String word1 = "hi ";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result);


        //Начинаеться на подстроку
        boolean startsWith = text.startsWith("He");
        System.out.println(startsWith);

        //Заканчиваеться на подстроку
        boolean endsWith = text.endsWith("world!");
        System.out.println(endsWith);

        //Обрезка с троки
        String substringed = text.substring(0, 5);
        System.out.println(substringed);
        String string = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(string);
    }
}
