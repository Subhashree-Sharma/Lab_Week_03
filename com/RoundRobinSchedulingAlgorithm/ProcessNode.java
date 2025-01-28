package com.RoundRobinSchedulingAlgorithm;

// Node class representing a process in the round-robin scheduler
class ProcessNode {
    int processId;
    int burstTime;
    int priority;
    ProcessNode next;

    //constructor
    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}