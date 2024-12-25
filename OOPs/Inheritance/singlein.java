package OOPs.Inheritance;

class Animal//parent class
{
    void sleep(){
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal//child class
{

}
public class singlein {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
