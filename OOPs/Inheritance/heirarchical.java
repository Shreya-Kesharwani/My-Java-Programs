package OOPs.Inheritance;

class Animal1{
    void sleep(){
        System.out.println("Animal need sleep");
    }
}

class Tiger1 extends Animal1{

}

class Monkey extends Animal1{
    
}

class Deer extends Animal1{
    
}

public class heirarchical {
public static void main(String[] args) {
    Tiger1 t = new Tiger1();
    t.sleep();
    Monkey m = new Monkey();
      m.sleep();
    Deer d = new Deer();
      d.sleep();
}    
}
