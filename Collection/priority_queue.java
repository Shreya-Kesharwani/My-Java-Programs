package Collection;
import java.util.PriorityQueue;
public class priority_queue {
 public static void main(String[] args) {
    PriorityQueue pq = new PriorityQueue();
//order of insertion is not preserved : jis order me data insert kiya uss order me nahi hai.
//priority queue follow karta hai min heap data structure ko.
    pq.add(100);
    pq.add(50);
    pq.add(150);
    pq.add(25);
    pq.add(75);
    pq.add(125);
    pq.add(175);

    System.out.println(pq);

    pq.add(25);
    System.out.println(pq);
    pq.add("PW");
 }   
}
