package lesson4;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 4_200_087;

        if (priceCar > 4_200_000){
            double oldPrice = priceCar;
            priceCar *= 0.95;
            System.out.println(oldPrice);

        }

        System.out.println(priceCar);
    }
}
