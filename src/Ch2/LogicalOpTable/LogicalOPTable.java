package Ch2.LogicalOpTable;

/**
 * Created by pasha on 10/16/16.
 */
public class LogicalOPTable {


    public static void main(String[] args) {


        ContoInt n = new ContoInt();
        int pt = n.boolP(true);
        int qt = n.boolQ(true);
        int pf = n.boolP(false);
        int qf = n.boolQ(false);

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");


        System.out.print(pt + "\t" + qt + "\t");
        System.out.print((pt & qt) + "\t" + (pt | qt) + "\t");
        System.out.println((pt ^ qt) + "\t" + (pt));

        System.out.print(pt + "\t" + qf + "\t");
        System.out.print((pt & qf) + "\t" + (pt | qf) + "\t");
        System.out.println((pt ^ qf) + "\t" + (pt));

        System.out.print(pf + "\t" + qt + "\t");
        System.out.print((pf & qt) + "\t" + (pf | qt) + "\t");
        System.out.println((pf ^ qt) + "\t" + (pf));

        System.out.print(pf + "\t" + qf + "\t");
        System.out.print((pf & qf) + "\t" + (pf | qf) + "\t");
        System.out.println((pf ^ qf) + "\t" + (pf));

    }
}
