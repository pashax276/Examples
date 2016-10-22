package Ch3.Guess4;

import java.io.IOException;

/**
 * Created by pasha on 10/21/16.
 */
public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'S', ignore;

        do {
            System.out.println("From A to Z");
            System.out.print("try to guess: ");

            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println(".... RIGHT ....");
            else {
                System.out.println(" looking letter located ");
                if (ch < answer) System.out.println("closer to end of alphabet");
                else System.out.println("closer to beginning of alphabet");
                System.out.println("try one more time");
            }
        } while (answer != ch);
    }
}
