package Multithreading;

class MyThread extends Thread{

    public void run()
    {
        System.out.println("Child Thread");
    }
}
public class mul03 {
    public static void main(String[] args) {
        System.out.println("Main thread");

        MyThread t = new MyThread();
        t.start();
    }
}
