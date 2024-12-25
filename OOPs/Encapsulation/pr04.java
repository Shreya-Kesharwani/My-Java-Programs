package OOPs.Encapsulation;

class MethodCall {
    private String name;
    private int age;
    private int roll_no;

    public static void setData(String name, int age, int roll_no) {
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
       System.out.println("Roll no : "+roll_no);
    }

 
}

public class pr04 {
    public static void main(String[] args) {
MethodCall.setData("Shreya", 19, 227);
    }
}
