package OOPs.Encapsulation;
class child{
    private int age;
    private String name;
   /*
   public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
   public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    */
    
    public void show(){
        System.out.println(name + " " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class setter {
    public static void main(String[] args) {
        child obj = new child();
         child obj1 = new child();
        obj.setAge(18);
          obj1.setAge(20);
            obj.setName("Shreya");
          obj1.setName("Suhani");
      int child1Age = obj.getAge();
      System.out.println(child1Age);
    }
}
