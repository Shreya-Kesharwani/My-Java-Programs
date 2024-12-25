package Interface;


interface A 
{
    int num = 6;//variables are by default public static final in interface.
    void show();//by default methods are public and abstract in interface.

    
}
public class interface01 {
    public static void main(String[] args) {
        System.out.println(A.num);
       
    }
}
