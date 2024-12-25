package Generics;
import java.util.*;
public class Collectionclass {
    public static void main(String[] args) {
        ArrayList as = new ArrayList();
        as.add(100);
        as.add(50);
        as.add(150);
        as.add(25);
        as.add(75);
        as.add(125);

        System.out.println(as);
        Collections.sort(as);
        System.out.println(as);

        ArrayList<String> as2 = new ArrayList<String>();
        as2.add("PW");
        as2.add("Hyder");
        as2.add("Java");
        as2.add("Shreya");
        as2.add("Suhani");
        as2.add("Yashi");

        System.out.println(as2);
        Collections.sort(as2);
        System.out.println(as2);


        ArrayList as3 = new ArrayList();
        as3.add(10);
        as3.add(20);
        as3.add(30);
        as3.add(40);
        as3.add(50);
        as3.add(60);

      int index = Collections.binarySearch(as3,40);
        System.out.println(index);

        Collections.rotate(as3,3);
        System.out.println(as3);

        Collections.shuffle(as3);
        System.out.println(as3);

        System.out.println(Collections.frequency(as3,20));
    }
}
