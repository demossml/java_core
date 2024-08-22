package oop.input_output;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/dmitrijsuvalov/Documents/java_core/article.txt";
        FileReader fileReader = new FileReader("/Users/dmitrijsuvalov/Documents/java_core/article.txt", StandardCharsets.UTF_8);

//        FileInputStream fileInputStream = new FileInputStream("/Users/dmitrijsuvalov/Documents/java_core/article.txt");
        StringBuilder result = new StringBuilder();

        while (fileReader.ready()) {
            char read = (char) fileReader.read();
            result.append(read);
//            System.out.print(read);
        }
        System.out.println(result);

        Scanner scanner = new Scanner(new File(fileName), StandardCharsets.UTF_8);
        if (scanner.hasNext()){
            System.out.println(scanner.nextLine());

        }
        fileReader.close();
//        System.out.println(scanner.nextLine());
    }
}
