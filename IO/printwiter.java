package IO;
import java.io.*;
public class printwiter {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file = new File(dir,"pw.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);//corresponding ascii value store hogi
        pw.write("\n");
        pw.println("Java");
        pw.println(100);//100 as it is store hoga.
        pw.println('a');
        pw.println(50.5);
        pw.println(true);
        pw.close();

    }
}
