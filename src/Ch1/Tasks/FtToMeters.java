package Ch1.Tasks;

/**
 * Created by pasha on 10/14/16.
 */
public class FtToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches/39.37;
            System.out.println(inches + " inches equal " + meters + " meters");


            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
