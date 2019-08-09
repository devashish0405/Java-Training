package Threading_pkg;

class MultithreadingDemo extends Thread
{
    public void run()
    {
        int c=0;
        try
        {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
        System.out.println(c);
    }
}
public class ThreadDemo extends Thread {
    public static void main(String[] args)  {
            int c=0;
            for (int i = 0; i < 10; i++) {
                ThreadDemo object = new ThreadDemo();
                object.start();
                c=c+1;
            }
        //System.out.println(c);
        }
    }
