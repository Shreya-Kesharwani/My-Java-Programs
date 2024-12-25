package OOPs.Constructor;

class Demo1
{
    static void disp1(){
        System.out.println("static method disp1");

    }

    void disp2(){
        System.out.println("non static disp2");
    }
}
public class static_nonstatic_method {
 public static void main(String[] args) {
    Demo1.disp1();
   // Demo1.disp2();

   Demo1 d = new Demo1();
   d.disp2();
   d.disp1();

   
 }   
}
