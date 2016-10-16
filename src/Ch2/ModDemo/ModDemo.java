package Ch2.ModDemo;

/**
 * Created by pasha on 10/15/16.
 */
public class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("int\n 10/3: " + iresult + " 10%3: " + irem);
        System.out.println("double\n 10/3: " + dresult + " 10%3: " + drem);

    }
}
