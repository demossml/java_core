package oop.lessio7;

import oop.lessio7.book.Book;

public class Task {
    public static void main(String[] args) {
        Book book = new Book("Три товарища", "Ремарк", 320, false);
//        book.printCountRows();
//        book.printCountRows(38);
        book.printInfo();
    }
}
