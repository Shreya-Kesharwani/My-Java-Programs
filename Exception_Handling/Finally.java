package Exception_Handling;
import java.util.*;


public class Finally {
    public static void main(String[] args){
       int num = 0;
       //Scanner sc = new Scanner(System.in);


       //try with resource
       try( Scanner sc = new Scanner(System.in)){
       num=sc.nextInt();
    
       }
        /* 
         * try{
       num=sc.nextInt();
    
       }
       catch(InputMismatchException e)
       {
        System.out.println("Enter a number");
     
       }
  
       finally
       {
        sc.close();
       }
        */
      
        System.out.println(num);
    
}
}
//DRY - Do not repeat yourself