package Questions;
import java.util.*;
public class greatestno {
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is the greatest among three numbers");
            }
            else{
                System.out.println(c+" is the greatest among three numbers");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is the greatest among three numbers");
            }
            else{
                System.out.println(c+" is the greatest among three numbers");
            }
        }
        
    }
}
