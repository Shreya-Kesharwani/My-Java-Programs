package Multithreading;

class Demo1 implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread Executing");
        try{
            Thread.sleep(3000);

        }
        catch(Exception e)
        {
            System.out.println("SOme problem");
        }
        System.out.println("Child thread task completed");
    }
}

public class mul07 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Demo1 d = new Demo1();
        Thread t1 = new Thread(d);//new state.

        t1.start();//runnable/ready state.
    }
}
