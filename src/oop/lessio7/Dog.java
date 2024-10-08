package oop.lessio7;

import java.util.Arrays;

public class Dog {
    private  String name = "Lord";
    private int weight = 50;
    private String owner = "Dmitry";
    {
        System.out.println("Собака создалась!");
    }

    public Dog(){

    }

    public Dog(String name, int weight, String owner) {
        if(weight < 1){
            this.weight = 5;
        }else{
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void  setWeight(int newWeight){
        if(newWeight < 1){
            this.weight = 5;
        }else{
            this.weight = newWeight;
        }
    }

    public String getOwner(){
        return "Mr. " + owner;
    }

    public void feed(String ...product){
        System.out.printf("Собака поела: %s\n", Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
