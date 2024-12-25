package Questions;
import java.util.*;

public class area_circum {

    void add_two_no(int a,int b){
      int sum;
        sum=a+b;
    System.out.println("The sum of " +a +" and " + b +" is "+sum);
    }
 
    void average(int a,int b){
        float avg;
        avg=(float)(a+b)/2;
        System.out.println("Average of two numbers is "+avg);
    }

    void area_of_circle(int r){
float area;
area=(float)3.14*r*r;
System.out.println("Area of circle is : "+area);

    }


    void perimeter_of_circle(int r){
        float perimeter;
        perimeter=(float)((2)*(3.14)*(r));
        System.out.println("Area of circle is : "+perimeter);
        
            }


            void greatest(int a,int b,int c){
                int g;
                g=(a>b)?(a>c)?a:c:(b>c)?b:c;
                System.out.println("The greatest number is "+g);
            }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        area_circum adno = new area_circum();
         int a,b,c;
        System.out.println("Enter a number");
        a=sc.nextInt();
        System.out.println("Enter another number");
        b=sc.nextInt();
        System.out.println("Enter another number");
        c=sc.nextInt();

        
        //adno.add_two_no(a,b);
        //adno.average(a,b);
        

        /* 
System.out.println("Enter radius of circle");
        int r = sc.nextInt();
        adno.area_of_circle(r);
        adno.perimeter_of_circle(r);
        */

        adno.greatest(a,b,c);
    }
}
