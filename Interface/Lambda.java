package Interface;
interface Car1
{
  void drive1(int avg,int ts);
  
}
public class Lambda {
    public static void main(String[] args) {
        Car1 obj = (avg, ts) ->
            {
             System.out.println("Driving..."+avg+ " "+ts);
            };
         
            obj.drive1(19,5);
    }
}
