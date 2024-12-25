package Multithreading;

import java.util.*;

class Demo {

}

class Calc1 extends Demo implements Runnable {
    public void run() {
        System.out.println("Calculation task started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);

        System.out.println("Calculation task Ended");

        System.out.println("********************************************");

    }
}

class Message1 implements Runnable {
    public void run() {
        System.out.println("Displaying important message task");
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some problem");
        }

        System.out.println("Displaying import message task ended");

        System.out.println("**********************************************");

    }
}

public class mul05 {
    public static void main(String[] args) {

        System.out.println("Main Thread");

        Calc1 c1 = new Calc1();
        Message1 m1 = new Message1();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);

        t1.start();
        t2.start();

        //t1.run(); 
        //t2.run();-->single threaded ki tarah behave karenga kyuki thrad ka  control thread schedular ke pass nahi hai.

    }
}
