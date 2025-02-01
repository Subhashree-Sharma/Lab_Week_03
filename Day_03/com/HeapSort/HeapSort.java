package com.HeapSort;

// Class containing Heap Sort logic
class HeapSort {
    // Method to perform heap sort
    public void heapSort(int[] salaries) {
        int n = salaries.length;

        //  Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        //extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (max element) to the end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Call heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to heapify a subtree with root at index 'i'
    public void heapify(int[] salaries, int n, int i) {
        int largest = i; // Assume root is the largest
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than current largest
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }
}

