package Ch3.Help;

/**
 * Created by pasha on 10/22/16.
 */
public class Help2 {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        do {
            System.out.println("Help");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. d0-while");
            System.out.print("Choose: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');

        switch (choice) {

            case '1':
                System.out.println("Operator if:\n");
                System.out.println("if (condition) operator;");
                System.out.println("else operator");
                break;
            case '2':
                System.out.println("Operator switch:\n");
                System.out.println(" switch (expression) {");
                System.out.println(" case constant:");
                System.out.println(" ... ;");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println(" }");
                break;
            case '3':
                System.out.println("for");
                break;
            case '4':
                System.out.println("while");
                break;
            case '5':
                System.out.println("do - while");
                break;
        }
    }
}

