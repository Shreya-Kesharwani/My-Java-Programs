package OOPs.Constructor;
class child{
    private int age;
    private String name;
   
    child(String name,int age){
        this.name=name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

      public String getName() {
        return name;
    }

  
}
public class cons01 {
    public static void main(String[] args) {
        child obj = new child("Rahul", 10);
      //  child obj1 = new child();
        
       String  name = obj.getName();
      System.out.println(name);

      int age = obj.getAge();
      System.out.println(age);
    }
}
