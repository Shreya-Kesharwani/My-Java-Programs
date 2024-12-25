package OOPs;

class Demo1
{
    int a,b;

    public Demo1(){
        System.out.println("Parent class constructor");
    }
    public Demo1(int x,int y){
        System.out.println("parameterized parent class constructor");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1{
    int m,n;
    public Demo2()
    {
        super(10,20);//agar nahi likha toh automatically call ho jata hai
        System.out.println("Child class constructor");
    }

     public Demo2(int x,int y)
    {
        //super();//calls parent class constructor
        System.out.println("parameterized Child class constructor");
        m=x;
        n=y;
    }
}
public class constructor_in_inheritance {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        //Demo2 d2= new Demo2(10,20);
    }
}
