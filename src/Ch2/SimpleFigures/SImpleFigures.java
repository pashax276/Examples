package Ch2.SimpleFigures;

/**
 * Created by pasha on 10/17/16.
 */
public class SImpleFigures {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;

            for (j = 2; j <= i / j; j++) {
                if ((i % j) == 0) isprime = false;

                if (isprime)
                    System.out.println("i:" + i);
            }
        }
    }
}
