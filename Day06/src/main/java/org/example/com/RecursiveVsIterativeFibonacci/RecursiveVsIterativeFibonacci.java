package org.example.com.RecursiveVsIterativeFibonacci;

public class RecursiveVsIterativeFibonacci {

        public static void main(String[] args) {
            //change this to test different values
            int n = 20;

            System.out.println("Fibonacci Computation Performance for N = " + n);

            //measure time for Recursive Fibonacci
            long startTime = System.currentTimeMillis();
            int recursiveResult = FibonacciRecursive.fibonacciRecursive(n);

            long endTime = System.currentTimeMillis();
            System.out.println("Recursive Result -  " + recursiveResult);
            System.out.println("Recursive Time -  " + (endTime - startTime) + " ms");

            //measure time for Iterative Fibonacci
            startTime = System.currentTimeMillis();
            int iterativeResult = FibonacciIterative.fibonacciIterative(n);
            endTime = System.currentTimeMillis();

            System.out.println("Iterative Result -  " + iterativeResult);
            System.out.println("Iterative Time -  " + (endTime - startTime) + " ms");
        }
    }

