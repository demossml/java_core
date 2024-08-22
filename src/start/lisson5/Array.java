package lisson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        y = 10;
        x = 22;
//        System.out.println(y);
//        System.out.println(x);
//        int[] array = new int[2];
//        array[0] = x;
//        array[1] =y;
//        int [] array = new int[] {x, y};
        int [] array =  {x, y};
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(array[1]);
        int[] array2 = array;
        array2[0] = 12;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
        char[] answer ={'Д', 'о', 'х', 'а'};



    }
}
