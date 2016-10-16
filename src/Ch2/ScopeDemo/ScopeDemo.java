package Ch2.ScopeDemo;

/**
 * Created by pasha on 10/15/16.
 */
public class ScopeDemo {
    public static void main(String[] args) {
        int x;

        x = 10;

        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " and " + y);
            x = y * 2;
        }
        System.out.println("x is " + x);
    }
}
