package Method_Overloading;

class Calculator
{
 public void show(int n){
   System.out.println("int "+n);
 }
 public void show(double n){
    System.out.println("double "+n);
  }

  /*public void show(short n){
    System.out.println("short "+n);
  }*/

  /*public void show(byte n){
    System.out.println("byte "+n);
  }*/

  public void show(char n){
    System.out.println("char "+n);
  }
}
public class Demo02 {
    public static void main(String[] args){
Calculator obj = new Calculator();
obj.show(4);//java me jo bhi numbers likhte hai by default use int treat kiya jata hai
byte b=2;
obj.show(b);

}
}
