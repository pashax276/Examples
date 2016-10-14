package Ch1.IfDemo;

/**
 * Created by pasha on 10/14/16.
 */
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 5;

        if (a < b) System.out.println("a less then b");
        if (a == b) System.out.println("You should not see this text");
        System.out.println();

        c = a - b;

        System.out.println("c contains -3");
        if (c >= 0) System.out.println("c - not negative figure");
        if (c < 0) System.out.println("c - negative figure");

        System.out.println();


        c = b - a;

        System.out.println("c contains 3");
        if (c >= 0) System.out.println("c - not negative figure");
        if (c < 0) System.out.println("c - negative figure");
    }
}
