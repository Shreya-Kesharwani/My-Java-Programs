package Annotation;
//this is parent class
@FunctionalInterface    //single abstract method.
interface Demo
{
    void disp();
    //void disp2();
}

@Deprecated
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }

}
//this is child class or subclass.
class CargoPlane extends Plane
{
    //overridden method from parent class
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("CargoPlane flies low");
    }


}
public class an01 {
    public static void main(String[] args) {
        //object of child class.
     Plane cp = new CargoPlane();
     cp.planeFliesAtGoodHeight();
    }
}
