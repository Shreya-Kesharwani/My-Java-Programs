package API;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
public class streamapi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,4,2,7,5);

        Stream<Integer> streamData = list.stream();

        //Predicate<Integer> pre =  i->i%2==0;
       /*  {
            public boolean test(Integer i)
            {
                if(i%2==0)
                return true;
                else
                return false;
            }
        };

        Stream<Integer> finalStream = streamData.filter(pre).sorted().map(n->n*2);
        finalStream.forEach(n->System.out.println(n));
*/

       Stream<Integer> finalStream = streamData.filter(n->n%2==0).sorted().map(n->n*2);
       finalStream.forEach(n->System.out.println(n));

        //Stream<Integer> filData=streamData.filter(n->n%2==0);

        //Stream<Integer> sortedStream = filData.sorted();

 

      //  Stream<Integer> mapStream=sortedStream.map(n->n*2);

//mapStream.forEach(n->System.out.println(n));

      // Stream<Integer> sortedStream = streamData.sorted();

       // sortedStream.forEach(n->System.out.println(n));

        
        
        //streamData.forEach(n->System.out.println(n));

    }
}
