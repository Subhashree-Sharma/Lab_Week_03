package org.example.com.SortingLargeDataEfficiently;
import java.util.Random;

public class GenerateData {

    //using method to generate random values array
    public static int[] generateRandomArray(int size, int min, int max){
        Random random = new Random();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
