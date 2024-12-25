package Enum;

enum Result1 {
    PASS, FAIL, NR;
}

// switch case and enum dono ek saath kaam kar rahe hai.
// enum ka object nahi bana sakte.
// class ke under enum ko define kar sakte hai.
public class switjchcase {
    public static void main(String[] args) {

        // Result1 res=Result1.PASS;
        Result1 res = Result1.FAIL;
        switch (res) {
            case PASS:
                System.out.println("Passed!");
                break;
            case FAIL:
                System.out.println("Failed!");
                break;
            case NR:
                System.out.println("No Result!");
        }
    }
}
