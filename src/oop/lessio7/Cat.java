package oop.lessio7;

import java.util.Arrays;

public class Cat {
     String color;
     double weight;
     String ownerName;

    public Cat(String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }
    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет %s диван ", sofaOwner);
    }

    public String hunt(boolean isDay){
        if (isDay){
            return  "Мышь";
        }
        return  "Сова";

    }

    public String hunt(boolean isDay, boolean success){
        if (success){
            if (isDay){
                return  "Мышь";
            }
            return  "Сова";
        }
       return "Ничего";

    }

    public void feed(String ...product){
        System.out.printf("Кот поел: %s\n", Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
