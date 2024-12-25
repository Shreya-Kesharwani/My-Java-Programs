package OOPs.Constructor;
class Student2{
    private String name;
    private int age;

    public Student2(){
        this("Rohit", 19);
        System.out.println("Default constructor is called");
        name = "Rohan";
        age  = 18;
    }

    public Student2(String name){
        this();
        this.name=name;
        age = 19;
    }

    public Student2(String name, int age){
        this.name=name;
        this.age = age;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class this_method {
    public static void main(String[] args) {
        Student2 st1 = new Student2();
        st1.disp();

        Student2 st2 = new Student2("Rahul");
        st2.disp();

        Student2 st3 = new Student2("Rahul",20);
        st3.disp();
    }
}
