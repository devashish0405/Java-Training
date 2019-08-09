package com.company;

public class Job {
    private String name;
    private int sequence;
    private int priority;


    Job(String name, int sequence, int priority){
        this.name = name;
        this.priority = priority;
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return name;
    }
}
