package Questions;
import java.util.*;
public class summation {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n= sc.nextInt();
int i=1;
int sum=0;
while(i!=n+1){
   
    sum=sum+i;
    i++;

}
System.out.println("The sum of n terms is "+sum);
    }
}
