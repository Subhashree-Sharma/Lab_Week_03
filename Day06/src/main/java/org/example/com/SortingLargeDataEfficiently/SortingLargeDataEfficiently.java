package org.example.com.SortingLargeDataEfficiently;
import java.util.Arrays;

public class SortingLargeDataEfficiently {
        public static void main(String[] args) {

            //dataset
            int[] sizes = {1000, 10_000, 1_000_000};
            int min = 1, max = 1_000_000;

            for (int size : sizes) {
                int[] data1 = GenerateData.generateRandomArray(size, min, max);
                int[] data2 = Arrays.copyOf(data1, data1.length);
                int[] data3 = Arrays.copyOf(data1, data1.length);

                System.out.println("Dataset Size- " + size);

                //Bubble Sort Timing
                //bubble Sort is too slow for large data
                if (size <= 10_000) {
                    long startTime = System.nanoTime();
                    SortingAlgorithms.bubbleSort(data1);
                    long endTime = System.nanoTime();
                    System.out.println("Bubble Sort Time- " + (endTime - startTime) / 1_000_000.0 + " ms");
                } else {
                    System.out.println("Bubble Sort- Unfeasible");
                }

                //Merge Sort Timing
                long startTime = System.nanoTime();
                SortingAlgorithms.mergeSort(data2, 0, data2.length - 1);
                long endTime = System.nanoTime();
                System.out.println("Merge Sort Time- " + (endTime - startTime) / 1_000_000.0 + " ms");

                //Quick Sort Timing
                startTime = System.nanoTime();
                SortingAlgorithms.quickSort(data3, 0, data3.length - 1);
                endTime = System.nanoTime();
                System.out.println("Quick Sort Time- " + (endTime - startTime) / 1_000_000.0 + " ms");

                System.out.println(" ");
            }
        }
    }
