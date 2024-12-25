package OOPs.Encapsulation;

class women{
    private int age;
    private String name;
   public void setData1(int a){
        age=a;
    }
   public void setData2(){
        name = "Rahul";
    }
    public void show(){
        System.out.println(name + " " + age);
    }
}
public class en02 {
    public static void main(String[] args) {
        women obj = new women();
         women obj1 = new women();
        obj.setData1(18);
          obj1.setData1(20);
        obj.show();
         obj1.show();
    }
}




