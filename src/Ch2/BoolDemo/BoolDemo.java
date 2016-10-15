package Ch2.BoolDemo;

/**
 * Created by pasha on 10/15/16.
 */
public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b: " + b);

        b = true;
        System.out.println("b: " + b);

        if (b) System.out.println("it is ok");

        b = false;
        if (b) System.out.println("this does not work");

        System.out.println("10 > 9: " + (10 > 9));
    }
}
