package Interface;
class A2{
    public void show()
    {
        System.out.println("in show");
    }
    static class B2{//Types : member inner class,static inner class, ananomous inner class.
 public void display()
    {
        System.out.println("in display");
    }
    }
}
public class inner_class {
    public static void main(String[] args) {
        A2 obj = new A2();
         //A2.B2 obj1 = obj.new B2(); //fore non static B2
         A2.B2 obj1 = new A2.B2();
    obj.show();
    obj1.display();
    }
}
