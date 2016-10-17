package Ch2.CastDemo;

/**
 * Created by pasha on 10/16/16.
 */
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10;
        y = 3;

        i = (int) (x / y);
        System.out.println("int x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);

    }
}
