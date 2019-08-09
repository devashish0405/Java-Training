package Threading_pkg;

class ThreadExample extends Thread{
    public void run(){
        try {Thread.sleep(1000);
            System.out.println("This is inside thread,ID="+Thread.currentThread().getId());
        }
        catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            ThreadExample t1 = new ThreadExample();
            t1.start();
        }
    }
}