package OOPs;
class Animal
{
    public void eat(){
        System.out.println("Animal eats everyday");
    }
}

class Tiger extends Animal
{
public void eat(){
    System.out.println("Tiger hunts and eat");
}
}
public class method_override {
    public static void main(String[] args) {
        Tiger t = new Tiger();
    t.eat(); 
    }
   
}
