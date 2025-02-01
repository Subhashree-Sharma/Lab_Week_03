package com.SelectionSort;

    // Class containing Selection Sort logic
    class SelectionSort {
        // Method to perform Selection Sort
        public void selectionSort(int[] scores) {
            int n = scores.length;

            for (int i = 0; i < n - 1; i++) {
                // Assume the first element is the minimum
                int minIndex = i;

                // Find the index of the minimum element in the remaining array
                for (int j = i + 1; j < n; j++) {
                    if (scores[j] < scores[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element of the unsorted part
                int temp = scores[minIndex];
                scores[minIndex] = scores[i];
                scores[i] = temp;
            }
        }
    }
