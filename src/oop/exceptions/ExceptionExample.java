package oop.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int d = 0;
        try {
            int[] ints = new int[2];
            System.out.println(ints[2]);
            System.out.println(a / d);
        } catch (ArithmeticException  e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("Программа работает дальше");

    }
}
