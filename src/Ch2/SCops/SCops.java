package Ch2.SCops;

/**
 * Created by pasha on 10/15/16.
 */
public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) System.out.println(d + " divider for " + n);

        d=0;
        if (d != 0 && (n % d) == 0) System.out.println(d + " divider for " + n);

        if (d != 0 & (n % d) == 0) System.out.println(d + " divider for " + n);
    }
}
