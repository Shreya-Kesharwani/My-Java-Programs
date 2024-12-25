package IO;
import java.io.*;
public class read {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file=new File(dir,"pw.txt");
        FileReader fd = new FileReader(file);
        char ch[] = new char[(int)file.length()];
        //int i =fd.read();
       // System.out.println((char)i);

       fd.read(ch);

       for(char data:ch){
        System.out.print(data);
       }

        /*while(i!=-1){
            System.out.println(i+"-------->");
            System.out.println((char)i);
            i=fd.read();
        }*/
    }
}
