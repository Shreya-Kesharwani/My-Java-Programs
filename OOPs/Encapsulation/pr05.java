package OOPs.Encapsulation;
class ConOver{
    static int age;
    static{
        age=19;
    }
    private int roll_no;
    private String name;

    public ConOver(){
      roll_no=227;
      name="Shreya";
      System.out.println("NAme: "+name+"Roll no. :"+roll_no);
    }

    public ConOver(int roll_no, String name){
        this.roll_no=roll_no;
        this.name=name;
        System.out.println("NAme: "+name+"Roll no. :"+roll_no);
      }
}
public class pr05 {
    public static void main(String[] args) {
        ConOver c1 = new ConOver();
        ConOver c2 = new ConOver(229,"Ishu"); 
    }

}
