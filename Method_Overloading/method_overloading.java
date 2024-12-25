package Method_Overloading;

class calc1{
  
    public int add(int n1, int n2)
	{
		int result=n1+n2;
		return result;
	}
	public int add(int n1, int n2,int n3)
	{
		int result=n1+n2+n3;
		return result;
	}
	public double add(double n1, double n2)
	{
		double result= n1 + n2;
		return result;
	}
}
class method_overloading {
    public static void main(String[] args) {
      calc1 obj=new calc1();
      int result=obj.add(4,3);
      int res1=obj.add(4,3,2);
      double res2=obj.add(4.2,3.1);
     System.out.println(result+" "+res1+" "+res2);

    }
}

