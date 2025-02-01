package com.HeapSort;

import java.util.Arrays;
import java.util.Scanner;

// Main class for user interaction
public class JobApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of applicants
        System.out.print("Enter the number of applicants: ");
        int n = scanner.nextInt();
        int[] salaries = new int[n];

        // Input Salary expectations
        System.out.println("Enter the expected salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = scanner.nextInt();
        }

        // Create an object of HeapSort and call heapSort method
        HeapSort sorter = new HeapSort();
        sorter.heapSort(salaries);

        // Output Sorted salary expectations
        System.out.println("Sorted salary expectations in ascending order: " + Arrays.toString(salaries));

        scanner.close();
    }
}
