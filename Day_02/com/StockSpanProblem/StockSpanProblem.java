package com.StockSpanProblem;
import java.util.Stack;

//stock span class
public class StockSpanProblem {
    //using method to calculate span
        public static int[] calculateSpan(int[] prices) {
            int n = prices.length;
            int[] span = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                // Pop elements from the stack while the stack is not empty and
                // the current price is greater than or equal to the top of the stack
                while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                    stack.pop();
                }

                // If stack is empty, no greater element exists, so span is i+1
                span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

                // Push current index to stack
                stack.push(i);
            }
            return span;
        }
    }


