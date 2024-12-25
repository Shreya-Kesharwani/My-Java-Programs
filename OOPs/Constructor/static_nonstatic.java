package OOPs.Constructor;

public class static_nonstatic {
    static int a;
    static int b;
   
int m;
int n;

static
{
    System.out.println("Control in static block");
    a=10;
    b=20;
}

{
    System.out.println("Control in non static block");
    m=30;
    n=40;
}

static void disp1(){
    System.out.println("Value os static var a : "+a);
      System.out.println("Value os static var b : "+b);
}

 void disp2(){
    System.out.println("Value of non static var m : "+m);
      System.out.println("Value of non static var n : "+n);
}

    public static void main(String[] args) {
        static_nonstatic d = new static_nonstatic();
        static_nonstatic.disp1();
        d.disp2();
        }
}