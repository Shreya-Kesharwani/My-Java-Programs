package Collection;
import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        //binary search tree. 
        ts.add(100);
         ts.add(50);
         ts.add(150);
         ts.add(25);
         ts.add(75);
         ts.add(125);
         ts.add(175);
         System.out.println(ts);
          ts.add(100);
           System.out.println(ts);

           System.out.println(ts.higher(50));
           System.out.println(ts.lower(50));

           System.out.println(ts.ceiling(40));//40 collection me present nahi hai.
           System.out.println(ts.floor(40));

             System.out.println(ts.ceiling(50));//50 collection me present hai.
           System.out.println(ts.floor(50));
    }
}
