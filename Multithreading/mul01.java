package Multithreading;
import java.util.*;

public class mul01 {
    public static void main(String[] args)
     {
        System.out.println("Calculation task started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);

        System.out.println("Calculation task Ended");

        System.out.println("********************************************");

        System.out.println("Printing * Task Started");

        for(int i=0;i<4;i++){
            System.out.println("*");
        }

        System.out.println("Printing * task Ended");

        System.out.println("*******************************************");

        System.out.println("Displaying important message task");
        for(int i=0;i<4;i++){
            System.out.println("Focus is important to master skills");
        }

        System.out.println("Displaying import message task ended");

        System.out.println("**********************************************");

        
    }
}
