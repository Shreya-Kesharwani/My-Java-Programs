package Interface;

interface B {
    void show();
}

interface X 
{
    void abc();
}

class C implements B,X {
    public void show() {
        System.out.println("in show");
    }

     public void abc()
     {
        System.out.println("in abc");
     }
}

public class interface02 {
    public static void main(String[] args) {
         C obj = new C();
       // B obj = new C();
        obj.show();
        obj.abc();
    }
}
