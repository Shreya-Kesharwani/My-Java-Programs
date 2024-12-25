package Exception_Handling;

public class try_catch {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result=0;
        int values[] = {4,7,2,9};
        String name = null;

        try
        {
             result = num1/name.length();
             System.out.println(values[5]);
        }
        catch(ArithmeticException obj)
       {

        System.out.println("can not divide by zero" + obj);
       }

       catch(ArrayIndexOutOfBoundsException obj)
       {

        System.out.println(values.length-1);
        System.out.println("Stay in your limits");
       }

       catch(Exception e)
       {
        System.out.println("Something went wrong");//Agar koi aisa exception aa jaye jo hum expect nahi kar rahe the ya hame nahi samajh aa raha tha ki yaha par bhi exception aa sakta hai toh ye catck block uske liye likha hai
       }
        System.out.println(result);
        System.out.println("Bye");
    }
}
