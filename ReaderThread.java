package com.company;

public class ReaderThread extends Thread{
    private Pool pool;
    private String name;
    private int seq;
    private int priority;
    ReaderThread(Pool pool, String name, int seq, int priority){
        this.pool = pool;
        this.name = name;
        this.seq = seq;
        this.priority = priority;
    }
    public void run(){
        Job job = new Job(this.name, this.seq, this.priority);
        pool.addToPool(job);
    }
}
