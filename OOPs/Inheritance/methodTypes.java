package OOPs.Inheritance;


class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }

    public void fly()
    {
        System.out.println("Aeroplane is Flying");
    }

}

class CargoPlane extends Aeroplane
{
  public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }

    public void carryGoods(){
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends Aeroplane
{
  public void fly()
    {
        System.out.println("PassengerPlane flies at mediun height");
    }

    
    public void carryPassenger(){
        System.out.println("PassengerPlane carries passengers");
    }
}
public class methodTypes {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.carryPassenger();
    }
}
