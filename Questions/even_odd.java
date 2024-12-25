package Questions;
import java.util.*;

public class even_odd {
    public static void main(String[] args){
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    a=sc.nextInt();

    if(a%2==0){
        System.out.println("Given number is even");
    }
    else{
        System.out.println("Given number is odd");
    }
    }
}
