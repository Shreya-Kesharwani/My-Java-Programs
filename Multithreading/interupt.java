package Multithreading;

class Example implements Runnable
{
    public void run()

    {
        for(int i=0;i<3;i++){
            try{
                System.out.println("Focus is important");
                Thread.sleep(2000); // Waiting state me le jaa rahe hai thread ko trakki use interrupt kar sake.
            }
            catch(InterruptedException e){
                System.out.println("Thread is interrupted");
            }
            
        }
        
    }

}
public class interupt {
    public static void main(String[] args) {
        Example ex = new Example();

        Thread t1 = new Thread(ex);

        t1.start();
        t1.interrupt();//Thread kewal waiting state me hi interrupt ho sakta hai.
    }
}
