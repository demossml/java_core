package oop.lessio8;
import java.util.ArrayList;


public class Car {
    private String brand;

    public static int countCars = 0;

    // Статические переменные с информацией о брендах
    public final static String BMW_INFO = "BMW: немецкий производитель автомобилей премиум-класса.";
    public final static String AUDI_INFO = "Audi: немецкий производитель автомобилей, известный своим качеством и инновациями.";
    public final static String KIA_INFO = "Kia: южнокорейский бренд, предлагающий доступные и надежные автомобили.";
    public final static  String[] BRAND_DESCRIPTION = new String[3];

    static {
        BRAND_DESCRIPTION[0] = BMW_INFO;
        BRAND_DESCRIPTION[1] = AUDI_INFO;
        BRAND_DESCRIPTION[2] = KIA_INFO;
    }




    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands(){
        System.out.println("Перечень доступнаых боендов: bmw, audi, kia");
    }
}
