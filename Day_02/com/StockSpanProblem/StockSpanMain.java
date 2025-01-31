package com.StockSpanProblem;
import java.util.Arrays;

//main class
public class StockSpanMain {

        public static void main(String[] args) {
            int[] prices = {8, 2, 3, 4, 5, 5, 6};

            int[] span = StockSpanProblem.calculateSpan(prices);

            System.out.println("Stock Prices: " + Arrays.toString(prices));
            System.out.println("Stock Span:   " + Arrays.toString(span));
        }
    }


