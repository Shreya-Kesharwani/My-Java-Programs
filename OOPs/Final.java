package OOPs;

/*final class Animal1{
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}*/

class Animal1{
   //final int age =19;//variable constant jaisa behave karega final keyword use karne ki wajah se.
   int age =19;
   final void sleep(){
    age =20;
        System.out.println("Animal is sleeping");
    }
}

class Tiger1 extends Animal1{
// void sleep(){
  //    final method we cannot override in child class  
    //}
}
public class Final {
    public static void main(String[] args) {
        Tiger1 t =new Tiger1();
        t.sleep();
    }
}
