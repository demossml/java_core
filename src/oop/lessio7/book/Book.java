package oop.lessio7.book;

public class Book {
    String name;
    String author;
    int pages;
    boolean isNonFiction;

    public Book(String name, String author, int pages, boolean isNonFiction) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isNonFiction = isNonFiction;
    }

    public void printCountRows(){
        System.out.println("Количество строк в книге: " + this.pages * 40);
    }

    public void printCountRows(int countRowsPage){
        System.out.println("Количество строк в книге: " + this.pages * countRowsPage);

    }public void printInfo(){
        System.out.printf("%s от %s - %s \n", this.name, this.author,
                this.isNonFiction ? "Документальная книга" : "Не документальная книга");
        printCountRows();
    }
}
