package org.example.com.RecursiveVsIterativeFibonacci;
public class FibonacciRecursive {

    //using method for recursive fibonacci
        public static int fibonacciRecursive(int n) {
            if (n <= 1) return n;
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
