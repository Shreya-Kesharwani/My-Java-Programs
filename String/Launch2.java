package String;

public class Launch2 {
    public static void main(String[] args)
    {
        String brand="pwskill";
        System.out.println(brand);
        brand.concat("bangaluru");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("pwskill");
        System.out.println(brand1);
        brand1.append("bangaluru");
        System.out.println(brand1);
    }
}
