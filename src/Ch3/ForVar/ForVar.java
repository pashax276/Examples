package Ch3.ForVar;

/**
 * Created by pasha on 10/21/16.
 */
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; sum += i++) {

            sum += i;
            System.out.println("sub: "+sum);
            fact *= i;
        }

        System.out.println("sum: " + sum);
        System.out.println("fact: " + fact);
    }
}
