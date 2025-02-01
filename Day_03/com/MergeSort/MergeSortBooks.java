package com.MergeSort;

//merge sort class
public class MergeSortBooks {
    //method to merge two sorted halves
    public static void merge(int[] prices, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays to store the left and right subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to the left subarray
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }
        // Copy data to the right subarray
        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        // Merge the two sorted subarrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right subarray
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to implement Merge Sort
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(prices, left, mid);
            // Recursively sort the right half
            mergeSort(prices, mid + 1, right);
            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }
}
