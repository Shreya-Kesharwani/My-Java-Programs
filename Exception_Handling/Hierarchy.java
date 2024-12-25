package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//unchecked exception and checked exception
public class Hierarchy {
    public static void main(String[] args) {
        int result = 7/0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
