package String;

public class equalsmethod {
    public static void main(String[] args) {
        String s1 = "PWskill";
        String s2 = new String("PWskill");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
System.out.println();

        String s3="PWjava";
        String s4="PWjava";
        String s5="PWJAVA";
        System.out.println(s3==s4);
         System.out.println(s3==s5);
       System.out.println(s3.equals(s4));
          System.out.println(s3.equals(s5));
    
          System.out.println();

          String s6="PWskill";
          String s7 = new String("PWskill");
          String s8 = new String("PWskill");

          System.out.println(s6==s7);
              System.out.println(s7==s8);  
               System.out.println(s6==s8);  
               
               System.out.println(s6.equals(s7));
               System.out.println(s7.equals(s8));
                  System.out.println(s6.equals(s8));

        }

}
