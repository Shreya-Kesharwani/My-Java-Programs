package IO;
import java.io.*;

class Cricketer implements Serializable//it is a marker interface matlab abstract method ki body nahi likhni padegi. 
{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name,int age,int runs){
        this.name=name;
        this.age=age;
        this.runs=runs;

    }
}
public class serialization {
    public static void main(String[] args) throws Exception {
        Cricketer c =new Cricketer("Sachin", 44, 30000);

        FileOutputStream fos = new FileOutputStream("pw.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();

    }
}
