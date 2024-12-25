package IO;
import java.io.*;
public class write {
    public static void main(String[] args) throws IOException
     {
        File dir = new File("PW");

        File file = new File(dir,"pw.txt");
       // file.createNewFile(); 
       FileWriter fw = new FileWriter(file,true);
       fw.write("PW");
       fw.write("\n");
       fw.write(65);
       fw.write("\n");
       fw.write(97);
       fw.write("\n");
       char ch[] = {'j','a','v','a'};
       fw.write("\n");
       fw.write(ch);
       fw.close();
       System.out.println("open pw.txt to see result");

    }
}
