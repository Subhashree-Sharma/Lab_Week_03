package com.CountingSort;

// Class containing Counting Sort logic
class CountingSort {
    // Method to perform Counting Sort
    public void countingSort(int[] ages, int minAge, int maxAge) {
        // Age range 10 to 18 -> 9 values
        int range = maxAge - minAge + 1;
        // Count array to store frequency
        int[] count = new int[range];
        // Output array for sorted ages
        int[] output = new int[ages.length];

        //Count occurrences of each age
        for (int age : ages) {
            // Store frequency at corresponding index
            count[age - minAge]++;
        }

        //Compute cumulative frequency
        for (int i = 1; i < count.length; i++) {
            // Update count[i] to store position
            count[i] += count[i - 1];
        }

        //Build the sorted output array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            // Decrease count for the placed element
            count[ages[i] - minAge]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }
}
