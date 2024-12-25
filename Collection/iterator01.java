package Collection;
import java.util.*;
public class iterator01 {
    public static void main(String[] args) {
        ArrayList al2 = new ArrayList();
        al2.add(30);
        al2.add(20);
        al2.add(30);
        al2.add(100);
        System.out.println(al2);

        Iterator itr = al2.iterator();
        while(itr.hasNext())
        {
           
           // Integer i = (Integer)itr.next();
       System.out.println(itr.next());
        }

        ListIterator litr = al2.listIterator(al2.size());

        while(litr.hasPrevious()){
 System.out.println(litr.previous());
        }
    }
}
