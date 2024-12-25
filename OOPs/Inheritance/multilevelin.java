package OOPs.Inheritance;

class Shreya1 {//extends Object class
    void disp() {
        System.out.println("Disp method written in Shreya1 class");
    }
}

class Shreya2 extends Shreya1 {

}

class Shreya3 extends Shreya2 {

}

public class multilevelin {
    public static void main(String[] args) {
Shreya3 s = new Shreya3();
s.disp();
    }
}
