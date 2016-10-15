package Ch2.Inches;

/**
 * Created by pasha on 10/14/16.
 */
public class Inches {
    public static void main(String[] args) {
        long ci, im;

        im = 5280 * 12;

        ci = im * im * im;
        System.out.println("One cubic mile contain " + ci + " cubic inches");

    }
}
