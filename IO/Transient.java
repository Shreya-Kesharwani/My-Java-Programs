package IO;
import java.io.*;

class Cricketer1 implements Serializable//it is a marker interface matlab abstract method ki body nahi likhni padegi. 
{
    String name;

    transient int age;
 
     int runs;

    public Cricketer1(String name,int age,int runs){
        this.name=name;
        this.age=age;
        this.runs=runs;

    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}
public class Transient {
    public static void main(String[] args) throws Exception {
       /*
         Cricketer1 c =new Cricketer1("Sachin", 44, 30000);
        c.disp();

        FileOutputStream fos = new FileOutputStream("pw.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();
        oos.close();
        */


FileInputStream fos = new FileInputStream("pw.txt");
        BufferedInputStream bos = new BufferedInputStream(fos);

        ObjectInputStream oos = new ObjectInputStream(bos);

        Cricketer1 cr = (Cricketer1)oos.readObject();
        cr.disp();




        
    }
}
