package OOPs.Encapsulation;
class Student{
    private int age;
    private String name;
   public void setData(){
        age=12;
        name = "Rahul";
    }
    public void show(){
        System.out.println(name + " " + age);
    }
}
public class en01 {
    public static void main(String[] args) {
        Student a = new Student();
        a.setData();
        a.show();
    }
}
