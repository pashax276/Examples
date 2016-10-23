package Ch3.Tastk;

import java.io.IOException;

/**
 * Created by pasha on 10/22/16.
 */
public class num10 {
    public static void main(String[] args) throws IOException {
        char ch;
        int change = 0;

        System.out.println("stop press . ");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                change++;
                System.out.println("CH - " + ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                change++;
                System.out.println("ch - " + ch);
            }
        } while (ch != '.');
        System.out.println("change " + change);

    }
}
