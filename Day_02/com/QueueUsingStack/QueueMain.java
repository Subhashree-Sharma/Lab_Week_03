package com.QueueUsingStack;

//main class
public class QueueMain {
    public static void main(String[] args) {

        ImplementQueue queue = new ImplementQueue();

        //performing enqueue, dequeue operation
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}