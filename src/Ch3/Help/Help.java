package Ch3.Help;

/**
 * Created by pasha on 10/19/16.
 */
public class Help {
    public static void main(String[] args) throws java.io.IOException {
        char choice;

        System.out.println("Help");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Choose: ");

        choice = (char) System.in.read();

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
            default:
                System.out.println("Inquiry have not found");
        }
    }
}
