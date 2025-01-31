package com.QueueUsingStack;
import java.util.Stack;

//implement queue class
public class ImplementQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public ImplementQueue() {
        // For enqueue
        stack1 = new Stack<>();
        // For dequeue
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int item) {
        stack1.push(item);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

 // To check empty or not
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}