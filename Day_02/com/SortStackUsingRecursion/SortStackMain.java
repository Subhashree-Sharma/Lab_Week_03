package com.SortStackUsingRecursion;
import java.util.Stack;

//main class
public class SortStackMain {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(3);
            stack.push(1);
            stack.push(4);
            stack.push(2);
            stack.push(5);

            System.out.println("Original Stack: " + stack);

            StackUsingRecursion.sortStack(stack);

            System.out.println("Sorted Stack: " + stack);
        }
    }


