package com.CountingSort;
import java.util.Arrays;
import java.util.Scanner;

// Main class for user interaction
public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] ages = new int[n];

        // Input Student ages (ranging from 10 to 18)
        System.out.println("Enter the ages of students between 10 and 18 - ");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }

        // Create an object of CountingSort and call countingSort method
        CountingSort sorter = new CountingSort();
        // Sorting ages in range 10-18
        sorter.countingSort(ages, 10, 18);

        // Output Sorted student ages
        System.out.println("Sorted student ages in ascending order: " + Arrays.toString(ages));

        scanner.close();
    }
}
