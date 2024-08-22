package oop.class_object;

public class Cat {
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return catName;
    }
}
