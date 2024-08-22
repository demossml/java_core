package oop.lessio8.task;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount= 0;

    public void cookHotDog(){
        if (sausageCount > 0 && breadCount > 1) {
            sausageCount--;
            breadCount -= 2;
            System.out.println("Хот-дог приготовлен");
        } else {
            System.out.println("Нете ингредоентов");
        }
    }

    public void addProducts(){
        sausageCount += 100;
        breadCount += 200;
    }

}
