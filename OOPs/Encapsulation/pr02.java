package OOPs.Encapsulation;
class ConsInitialize{
private String name;
private int roll_no;
private int age;

public ConsInitialize(String name,int roll_no,int age){
    this.name=name;
    this.roll_no=roll_no;
    this.age=age;

}

public String getName(){
    return name;
}

public int getroll_no(){
    return roll_no;
}

public int getAge(){
    return age;
}
}
public class pr02 {
    public static void main(String[] args) {
        ConsInitialize c1 =new ConsInitialize("Shreya",227,19);
        System.out.println("Student name "+c1.getName());
        System.out.println("Student name "+c1.getroll_no());
        System.out.println("Student name "+c1.getAge());
        

    }
}
