package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Pool {
    private Queue<Job> q = new LinkedList<>();
    Pool(){}
    public void addToPool(Job job){
        q.add(job);
    }
    public void removeFromPool(){
        q.remove();
    }
    public int getCurrentSizeOfPool(){
        return q.size();
    }
}
