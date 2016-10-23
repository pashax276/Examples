package Ch3.Tastk;

import java.io.IOException;

/**
 * Created by pasha on 10/22/16.
 */
public class num1 {
    public static void main(String[] args) throws IOException {
        char sym;
        int spacers = 0;
        do {
            sym = (char) System.in.read();
            if (sym == ' ') spacers++;
        } while (sym != '.');
        System.out.println("Spacers: " + spacers);
    }
}
