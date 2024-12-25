package OOPs.Inheritance;
class Human1 //super class //Base class // Parent class
{
    private String name;
    int age;

    Human1(){
        System.out.println("Human class Constructor");
    }
    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1 //child class //sub class //derived class

// public Student1()
//{
          //super();//calls parent class constructor
//}
{
    void disp(){
        System.out.println(" The age is : "+ age);
       // System.out.println(" The name is : "+ name);
    }
}
public class in02 {
    public static void main(String[] args) {
        Student1 st = new Student1();
        st.sleep();
    }
}
