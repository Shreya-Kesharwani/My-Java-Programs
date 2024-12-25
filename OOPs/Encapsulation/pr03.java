package OOPs.Encapsulation;
class SetGet{
    private String password;
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
public class pr03 {
    public static void main(String[] args) {
        SetGet s1 = new SetGet();
        s1.setPassword("ishu");
       System.out.println("Your password is "+ s1.getPassword());


    }
}
