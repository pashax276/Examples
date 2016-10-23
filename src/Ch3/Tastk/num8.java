package Ch3.Tastk;

/**
 * Created by pasha on 10/22/16.
 */
public class num8 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) continue;
            System.out.println();
        }
    }
}
