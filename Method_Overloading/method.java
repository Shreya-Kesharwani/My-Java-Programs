package Method_Overloading;

class Addition{
    public int add (int n1,int n2)
{
int result=n1+n2;
return result;
}
}
public class method {
    public static void main(String[] args){
Addition obj = new Addition();
int result=obj.add(3,4);
System.out.println(result);
    }
}
