package Exception_Handling;

public class ex01 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result=0;

        try
        {
             result = num1/num2;
             System.out.println("in try block");
        }
        catch(Exception obj)
       {
        System.out.println("Something went wrong...");
       }
        System.out.println(result);
        System.out.println("Bye");
    }
}
