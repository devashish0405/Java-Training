package com.company;

import java.security.PrivateKey;

public class WriterThread extends Thread {
    private Pool pool;
    private String name;
    private int seq;
    private int priority;
    WriterThread(Pool pool, String name, int seq, int priority){
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
