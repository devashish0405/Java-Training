package com.company;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        Pool pool = new Pool();
        for(int i=0; i<10; i++){
//            WriterThread wt = new WriterThread(pool, "Job-"+i, i,i );
            ReaderThread wt = new ReaderThread(pool, "Job-"+i, i,i );
            wt.start();
            try{
                wt.join();
            }catch(Exception e){
                System.out.println("Exception Caught");
            }
        }
        System.out.println(pool.getCurrentSizeOfPool());
    }
}
