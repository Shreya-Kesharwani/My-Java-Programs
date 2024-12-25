package Interface;

interface Car
{
  void drive();
  
}

/*class WagonR implements Car{
    public void drive()
    {
        System.out.println("Driving...");
    }
}*/
public class AICD {
    public static void main(String[] args) {
       //Car obj = new WagonR();
       Car obj = new Car() {
       public void drive(){
        System.out.println("Driving...");
       }
    };
       obj.drive();

    }
}
