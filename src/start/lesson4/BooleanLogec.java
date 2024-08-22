package start.lesson4;

public class BooleanLogec {
    public static void main(String[] args) {
        // Сынок купил хлеб
        boolean isBoughBread = true;
        // Сынок купил молоко
        boolean isBoughMilk = false;

        //And - Логичекий оператор
        boolean isBoughMilkAndBread = isBoughBread && isBoughMilk;
        //boolean isBoughMilkAndBread = true && true;
        //boolean isBoughMilkAndBread = true;

        if (isBoughBread && isBoughMilk){
            System.out.println("Моледец");
        }else if (isBoughMilk) {
            System.out.println("Milk");
        }else if (isBoughBread){
            System.out.println("Bread");
        }
        else{
            System.out.println("Не молодец");}
        // Or
        if (isBoughBread || isBoughMilk){
            System.out.println("Моледец");}

        // Not !
        boolean isBoughCandy = false;

        if (!isBoughCandy){
            System.out.println("Мама не хвалит сына");
        }




    }
}
