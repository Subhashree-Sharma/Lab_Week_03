package com.InsertionSort;
import java.util.Arrays;
import java.util.Scanner;

//insertion sort class
public class InsertionSort {
    //method to perform Insertion Sort
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;

        for (int i = 1; i < n; i++) {
            //pick the current element from the unsorted part
            int key = employeeIDs[i];
            int j = i - 1;

            // Shift larger elements to the right to make space for the key
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                // Move to the previous element
                j--;
            }

            // Insert the key at the correct position
            employeeIDs[j + 1] = key;
        }
    }

    //main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        int[] employeeIDs = new int[n];

        // Input Employee IDs
        System.out.println("Enter the employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIDs[i] = scanner.nextInt();
        }

        // Sort Employee IDs using Insertion Sort
        insertionSort(employeeIDs);

        // Output Sorted Employee IDs
        System.out.println("Sorted Employee IDs in ascending order: " + Arrays.toString(employeeIDs));

        scanner.close();
    }
}
