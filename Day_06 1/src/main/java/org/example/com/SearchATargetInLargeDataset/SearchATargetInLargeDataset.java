package org.example.com.SearchATargetInLargeDataset;
import java.util.Arrays;
import java.util.Random;
public class SearchATargetInLargeDataset {

    //using method to generate random numbers array
    public static int[] generateRandomArray(int size, int min, int max){
        Random random = new Random();
        int arr[] = new int[size];

        //using loop to get random values
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    //linear search o(n)
    public static int linearSearch(int arr[] , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //binarySearch - o(log n)
    public static int binarySearch(int arr[], int target){
        int left = 0, right = arr.length-1;

        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int sizes[] = {1000, 10000, 1000000};
        //range of numbers min, max
        int min = 1;
        int max = 1000000;

        for(int size : sizes){
            int[] data = generateRandomArray(size, min, max);
            //nextInt(size)-> generates a random integer between 0 and size - 1
            //pick a random target from data
            int target = data[new Random().nextInt(size)];

            //linear search timing
            long startTime = System.nanoTime();
            linearSearch(data, target);
            long endTime = System.nanoTime();
            long linearTime = endTime - startTime;

            //sorting for binary search
            Arrays.sort(data);

            //binary search timing
            startTime = System.nanoTime();
            binarySearch(data, target);
            endTime = System.nanoTime();
            long binaryTime = endTime - startTime;

            //Displaying result
            System.out.println("Dataset size - " + size);
            System.out.println("Linear search time - " + linearTime / 1000000.0 + "ms");
            System.out.println("Binary search time - " + binaryTime / 1000000.0 + "ms");
            System.out.println();
        }

    }
}
