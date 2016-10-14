package Ch1.BlockDemo;

/**
 * Created by pasha on 10/14/16.
 */
public class BlockDemo {
    public static void main(String[] args) {
        int i, j, d;

        i = 0;
        j = 10;
        if (i != 0) {
            System.out.println("i does not equel to 0");

            d = j / i;
            System.out.println("d: " + d);
        } else {
            System.out.println("i equal to 0");
        }
    }
}
