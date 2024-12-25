package OOPs.Encapsulation;

class Man{
    private int age;
    private String name;
   public void setData1(int age){
        this.age=age;
    }
   public void setData2(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name + " " + age);
    }
}
public class this_keyword {
    public static void main(String[] args) {
        Man obj = new Man();
         Man obj1 = new Man();
        obj.setData1(18);
          obj1.setData1(20);
            obj.setData2("Shreya");
          obj1.setData2("Suhani");
        obj.show();
         obj1.show();
    }
}





