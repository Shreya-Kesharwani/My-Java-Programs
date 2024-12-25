package Collection;
import java.util.*;
public class hashtable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"Rohit");
        ht.put(2,"Rohit");
        ht.put(3,"Ramesh");
       // ht.put(null,"hyder");->not allowed.
ht.putIfAbsent(2,"Rohan");
        System.out.println(ht);
        //order of insertion is not present.
        //keys duplicate nahi hona chahiye
        //Behind the scenes yeh hash table ko hi follow karta hai.

        TreeMap tm = new TreeMap();

        Integer i = new Integer(5);
        tm.put(i,"Rohit");
        tm.put(1,"Ramesh");
        tm.put(4,"Rahul");
        tm.put(3,"Rohan");
        System.out.println(tm);

        //ascending sorted order me data milega.
    }
}
