package API;
//import java.util.Date;
//import java.util.ArrayList;
public class Date_time {
    public static void main(String[] args) {
        java.util.Date dt =new java.util.Date();
        System.out.println(dt);

        long timeInMs = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(timeInMs);
        System.out.println();
        System.out.println(dt1);
    }
}
