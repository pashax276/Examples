package GalToLit;

/**
 * Created by pasha on 10/14/16.
 */
public class GalToLitCounter {
    public static void main(String[] args) {
        double gallon, litter;
        int counter;

        counter = 0;
        for (gallon = 1; gallon <= 100; gallon++) {
            litter = gallon * 3.7854;
            System.out.println(gallon + " gallons equal " + litter + " liters");


            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
