package IO;
import java.io.*;
public class io02 {
    public static void main(String[] args) throws IOException {
       /*  File dir1 = new File("PWJAVA");
       // System.out.println(dir1.isDirectory());
        dir1.mkdir();
     System.out.println("dir is referring to directory PWJAVA : " + dir1.isDirectory());
        File file = new File(dir1,"pwskill.txt");
        file.createNewFile();
        System.out.println(file.isFile());
        */

        int count =0;
        File f = new File("PWJAVA");
        String str[] = f.list();
    
        for(String name : str){
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are "+count);
    }
}
