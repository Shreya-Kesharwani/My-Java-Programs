package OOPs.Encapsulation;
 public class MyClass{
    private static int  count = 0;
    public MyClass()
    {
        count++;
    }
    public static int getCount()
    {
        return count;
    }
} 
 class practice01 {
    public static void main(String[] args) {
        MyClass c1= new MyClass();
        MyClass c2= new MyClass();
        MyClass c3= new MyClass();

        System.out.println("Number of instances created : "+ MyClass.getCount());
    }
}
