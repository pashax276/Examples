package Ch3.KbIn;

/**
 * Created by pasha on 10/17/16.
 */
public class KbIn {
    public static void main(String[] args) throws java.io.IOException{
char ch;
        System.out.print("Press Enter");
        ch = (char)System.in.read();

        System.out.println(ch);
    }
}
