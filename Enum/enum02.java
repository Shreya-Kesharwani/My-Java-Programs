package Enum;

enum Result {
    PASS, FAIL, NR;

    //public static final Result PASS=new Result();

    //public static final Result FAIL=new Result();

    //public static final Result NR = new Result();

    // INSIDE AN ENUM VARIABLES, CONSTRUCTOR,METHODS KO BHI LIKH SAKTE HAI.

    //JITNE BHI CONSTANT AAP DEFINE KARENGE ENUM KE UNDER UTNE BAAR CONSTRUCTOR CALL HOTA HAI.

    int marks;

    Result() {
        System.out.println("Constructor in enum");
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

public class enum02 {
    public static void main(String[] args) {

        Result.PASS.setMarks(50);

        int m1 = Result.PASS.getMarks();
        System.out.println(m1);//50

        int m2 = Result.FAIL.getMarks();
        System.out.println(m2);

        Result.NR.setMarks(45);
        int m3 = Result.NR.getMarks();
        System.out.println(m3);
    }
}
