package oop.input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWihResourcesExample {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/dmitrijsuvalov/Documents/java_core/article.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            throw new RuntimeException("Ошибка!");

        } catch (Exception e){

        }finally {
            System.out.println("Блок finally!");
            fileReader.close();
        }

        try (FileReader fileReader2 = new FileReader(fileName)){
            System.out.println("Обработчик файла");
        }catch (Exception e) {

        }

    }
}
