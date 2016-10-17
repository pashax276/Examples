package Ch2.SideEffect;

/**
 * Created by pasha on 10/15/16.
 */
public class SideEffect {
    public static void main(String[] args) {
        int i;
        i=0;

        if(false & (++i<100)) System.out.println("Yuo won't see this line");
        System.out.println("if is working: "+i);

        if(false && (++i<100)) System.out.println("Yuo won't see this line");
        System.out.println("if is working: "+i);

    }
}
