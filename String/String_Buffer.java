package String;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity());//how many characters you can keep.
        System.out.println(sb.length());//how many characters are present.

        System.out.println();
        System.out.println();

        StringBuffer sb2 = new StringBuffer("Sachin");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(1));
       sb2.setCharAt(1,'A');
       System.out.println(sb2);

       System.out.println();

       StringBuilder sb3 = new StringBuilder(150);
       System.out.println(sb3.capacity());
       sb3.append("java");
       System.out.println(sb3);
       sb3.trimToSize();
       System.out.println(sb3.capacity());



    }
}
