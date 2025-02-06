package com.BinarySearchProblem.FindPeakElement;
public class FindThePeakElement {

    //using method to find peak element in an array
    static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        //run until left is smaller than right
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    //main method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int peakIndex = findPeakElement(arr);

        //Displaying result
        System.out.println("Peak element index - " + peakIndex);
        System.out.println("Value of peak element - " + arr[peakIndex]);
    }
}