package com.QuickSort;

    // Class containing Quick Sort logic
    public class QuickSortEcommerce {
        // Method to partition the array
        public int partition(int[] prices, int low, int high) {
            // Choosing the last element as pivot
            int pivot = prices[high];
            // Pointer for smaller element
            int i = low - 1;

            for (int j = low; j < high; j++) {
                // If current element is smaller than or equal to pivot
                if (prices[j] <= pivot) {
                    i++;
                    // Swap prices[i] and prices[j]
                    int temp = prices[i];
                    prices[i] = prices[j];
                    prices[j] = temp;
                }
            }

            // Swap the pivot element with the element at i+1
            int temp = prices[i + 1];
            prices[i + 1] = prices[high];
            prices[high] = temp;

            // Returning the partition index
            return i + 1;
        }

        // Method to perform Quick Sort
        public void quickSort(int[] prices, int low, int high) {
            if (low < high) {
                // Get the partition index
                int pi = partition(prices, low, high);
                // Sort elements before partition
                quickSort(prices, low, pi - 1);
                // Sort elements after partition
                quickSort(prices, pi + 1, high);
            }
        }
    }

