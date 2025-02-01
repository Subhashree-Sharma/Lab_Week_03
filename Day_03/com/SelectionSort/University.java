package com.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

//main class for user interaction
public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] scores = new int[n];

        // Input Exam scores
        System.out.println("Enter the exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Create an object of SelectionSort and call selectionSort method
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(scores);

        // Output Sorted exam scores
        System.out.println("Sorted exam scores in ascending order: " + Arrays.toString(scores));

        scanner.close();
    }
}

