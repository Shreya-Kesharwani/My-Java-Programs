package OOPs.Inheritance;
class Human //super class //Base class // Parent class
{
    int age;
    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human  //child class //sub class //derived class
{

}
public class in01 {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
    }
}
