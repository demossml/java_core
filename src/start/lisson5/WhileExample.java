package start.lisson5;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100){
            System.out.println(count);
            count++;
        }
        System.out.println("while stop");

        while (true){
            count++;
            System.out.println(count);
            if (count == 1000000){
                break;
            }

        }
        System.out.println("while2 stop");

    }
}
