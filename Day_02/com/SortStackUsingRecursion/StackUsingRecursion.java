package com.SortStackUsingRecursion;
import java.util.Stack;
public class StackUsingRecursion {

        //function to sort a stack using recursion
        public static void sortStack(Stack<Integer> stack) {
            if (!stack.isEmpty()) {
                //pop the top element
                int temp = stack.pop();

                //Recursively sort the remaining stack
                sortStack(stack);

                //Insert the popped element back in the correct position
                insertSorted(stack, temp);
            }
        }

        //method to insert an element into a sorted stack
        private static void insertSorted(Stack<Integer> stack, int element) {
            // Base case: If stack is empty or the top element is smaller than the new element
            if (stack.isEmpty() || stack.peek() <= element) {
                stack.push(element);
                return;
            }

            // Otherwise, pop the top and insert the element in the sorted order
            int temp = stack.pop();
            insertSorted(stack, element);

            // Push back the popped element
            stack.push(temp);
        }
    }
