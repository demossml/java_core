package start.lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int bradPrice = 20;
        int moneyAfterShopping = money -bradPrice;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        moneyAfterShopping -= moneyAfterShopping >= 50 ? 10 : 5;
        System.out.println(childMoney);
        System.out.println(moneyAfterShopping);


    }
}
