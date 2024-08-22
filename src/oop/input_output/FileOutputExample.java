package oop.input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {
        String filName = "/Users/dmitrijsuvalov/Documents/java_core/menu2.txt";
        String menu = "Хлеб стоит 40 рублей\n";
        String menu2 = "Бананы стоит 60 рублей\n";


        try( FileOutputStream outputStream = new FileOutputStream(filName, true)) {
            outputStream.write(menu2.getBytes());
        }



    }
}
