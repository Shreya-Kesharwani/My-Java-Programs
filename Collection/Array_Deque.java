package Collection;
import java.util.*;
public class Array_Deque {
    public static void main(String[] args) {
        //In array deque we can add datab from the front end and rear end. we can not add data from random index.
    ArrayDeque ad1 = new ArrayDeque();
    ad1.add(100);
    ad1.add(200);
    ad1.add(200);
    System.out.println(ad1);
    ad1.addFirst(10);
    ad1.addLast(20);

    System.out.println(ad1);
    ad1.add("PW");
    System.out.println(ad1);

    ad1.offer(500);
    ad1.offerLast(100);
    ad1.offerLast(10);
//offer can be used for insertion operation  but sometimes it may get rejected in case of offer method.
    System.out.println(ad1);

    
    
    }
   
}
