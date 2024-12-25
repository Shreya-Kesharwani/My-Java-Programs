package Collection;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
       /*  HashMap hm = new HashMap();
        Hashtable ht = new Hashtable();
        LinkedHashMap lhm = new LinkedHashMap();
        TreeMap tm = new TreeMap();*/

        HashMap hm1 = new HashMap();
        hm1.put(null,null);
               hm1.put(02,"Rohit");
         hm1.put(03,"Rohan");
          hm1.put(04,"Rohan");
             hm1.put(04,"Rohan");

         System.out.println(hm1);
//order of insertion is not preserved in hashmap.
         HashMap hm2 = new HashMap();
        hm2.put(null,null);
               hm1.put("Rohit","Rohit");
         hm2.put("Virat","Rohan");
          hm2.put("Rohit","Rohan");
             hm2.put("Hyder","Rohan");

         System.out.println(hm2);




         LinkedHashMap lhm = new LinkedHashMap();
         lhm.put("Virat", "Rohit");
         lhm.put("Rohit","Rohan");
         lhm.put("Hyder","Rohan");
         System.out.println(lhm);
    }
}
