package OOPs.Constructor;

public class staticBlock {
    static int a;
    static{
        System.out.println("Static Block");
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
