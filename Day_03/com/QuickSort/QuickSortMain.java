package com.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

// Main class for user interaction
public class QuickSortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of products
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        // Input Product prices
        System.out.println("Enter the product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Create an object of QuickSort and call quickSort method
        QuickSortEcommerce sorter = new QuickSortEcommerce();
        sorter.quickSort(prices, 0, n - 1);

        // Output Sorted product prices
        System.out.println("Sorted product prices in ascending order: " + Arrays.toString(prices));

        scanner.close();
    }
}

