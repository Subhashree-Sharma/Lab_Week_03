package com.BubbleSort;
import java.util.Arrays;
import java.util.Scanner;

//bubble sort class
public class BubbleSort {

    //using method to sort the marks
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j + 1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            //if no swaps were made in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    //main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];

        // Input Student marks
        System.out.println("Enter the marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }

        // Sort marks using Bubble Sort
        bubbleSort(marks);

        // Output Sorted marks
        System.out.println("Sorted marks in ascending order: " + Arrays.toString(marks));

        scanner.close();
    }
}
