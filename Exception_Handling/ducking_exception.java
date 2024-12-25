package Exception_Handling;
//handling vs ducking an exception
class Demo
{
    public void a() throws Exception
    {
        b();
         /*  try{ 
            b();
           }
         catch(Exception e){
            System.out.println("error "+e.getMessage());
        }*/
  
    }
    public void b() throws Exception
    {
        int num1=8;
        int num2=0;
      
        int result = num1/num2;
        System.out.println(result);
      
     
    }
}
public class ducking_exception {
    public static void main(String[] args) {
        Demo obj = new Demo();
        
        try{
            obj.a();
        }
        catch(Exception e){
            System.out.println("error "+e.getMessage());
        }

    }
}
