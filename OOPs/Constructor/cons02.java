package OOPs.Constructor;

class Demo {
    private int a;
    private int b;

    /*Zero parameterize default constructor
      public Demo()
      {
      
      }
     */

     //Default constructor include hota hai if and only if poore program me kahi par bhi koi constructor present nahi hai aur aap zero parameterized constructor ko call kar rahe ho


     public Demo(){
        System.out.println("Zero parameterize constructor by programmer");
     }
     public Demo(int a,int b){
           this.a = a;
           this.b=b;
     }

    void disp() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class cons02 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.disp();
        
        Demo d2 = new Demo(10,20);
        d2.disp();
    }

}
