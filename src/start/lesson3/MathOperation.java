package lesson3;

public class MathOperation {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        int sum = x + y;
//        System.out.println(sum);


        int diff = x - y;
//        System.out.println(diff);

        int multiply = x * y;
//        System.out.println(multiply);
        y = 7;
        double divide = (double) x / y;
//        System.out.println(divide);

        int ext = x * x;
//        System.out.println(ext);
        // Инкримент
        // x = x + 1;
        // x++;
        // x*=10;
        // x/=10;
        // x-=10;
        x+=10;

        //Декримент
        x = x - 1;
//        System.out.println(x);
        x--;
//        System.out.println(x);

        //Остаток от деления
        int number = 4;
        int modulo = number % 3;
//        System.out.println(modulo);

        //Скобки
        int z = (2 + 2) *2;
        System.out.println(z);




    }
}
