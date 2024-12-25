package OOPs.Abstraction;

 abstract class AeroPlane2
{
   abstract public void takeOff();
    
    abstract public void fly();
    
    public void Landing(){
        System.out.println("Aeroplane is Landing");
    }
}

class CargoPlane2 extends AeroPlane2{
    public void takeOff()
    {
        System.out.println("Cargoplane requires longerf runway");
    }
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height");
    }

    public void Alert(){
        System.out.println("Alert");
    }
}

class PassengerPlane2 extends AeroPlane2{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}




public class abs01 {
    public static void main(String[] args) {
     AeroPlane2 ref1 = new CargoPlane2();
     ref1.takeOff();
     ref1.fly();
     ref1.Landing();

     AeroPlane2 ref2 = new PassengerPlane2();
     ref2.takeOff();
     ref2.fly();
ref2.Landing();

 // AeroPlane3 ref=new AeroPlane3();

}
}

