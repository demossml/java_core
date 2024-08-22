package oop.inheritance.lession9.interfaces.task;

public class Runner {
    public static void main(String[] args) {
        //Есть три класса:
        //Рыба - умеет плавать
        //Утка - умеет плавать и летать
        //Самолет - умеет летать
        //Создать по экземпляру каждого класса, создав интерфейсы
        //Закинуть плавающих в бассейн (в нем могут быть только те объекты, которые умеют плавать)
        //Отправить летающих в небо (в нем могут быть только те объекты, которые умеют летать)
        Fish fish = new Fish();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();
        Swimable[] swimables ={fish, duck};
        Flyable[] sky = {airplane, duck};

        for (Swimable swimable: swimables){
            swimable.swim();
        }
        for (Flyable flyable : sky) {
            flyable.fly();
        }

    }
}
