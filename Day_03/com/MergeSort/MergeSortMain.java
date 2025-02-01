package com.MergeSort;
import java.util.Arrays;
import java.util.Scanner;

//main class
public class MergeSortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of books
        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        // Input Book prices
        System.out.println("Enter the prices of books:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        MergeSortBooks sort = new MergeSortBooks();
        // Sort book prices using Merge Sort
        sort.mergeSort(prices, 0, n - 1);

        // Output Sorted book prices
        System.out.println("Sorted book prices in ascending order: " + Arrays.toString(prices));

        scanner.close();
    }
}

