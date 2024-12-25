package OOPs.Polymorphism;
class Aeroplane1
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane1 extends Aeroplane1{
    public void takeOff()
    {
        System.out.println("Cargoplane requires longerf runway");
    }
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height");
    }
}

class PassengerPlane1 extends Aeroplane1{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();
       // cp.fly();

        PassengerPlane1 pp = new PassengerPlane1();

        Aeroplane1 ref;
        ref=cp;

        ref.takeOff();
        ref.fly();

        System.out.println("-----------------");
        ref = pp;
        ref.takeOff();
        ref.fly();

       // pp.takeOff();
        //pp.fly();
    }
}
