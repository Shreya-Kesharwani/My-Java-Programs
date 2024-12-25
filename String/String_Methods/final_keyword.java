package String.String_Methods;

public class final_keyword {
   public static void main(String[] args){
   /*final int a=10;
    a=20;
    System.out.println(a);*/

    final StringBuffer sb = new StringBuffer("Virat");
    sb.append("kohli");
    System.out.println(sb);
    //sb = new StringBuffer("Sachin");//final keyword ka impact mutability par nahi hota hai uska impact reference variable pe hota hai in case of string iss case me hamara reference variable hai sb.
    System.out.println(sb);
   }
}
