package com.BinarySearchProblem.FirstAndLastOccurence;

public class FirstLastOccurence {

    //Binary search for the first occurrence
    public static int findFirstOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        //run until left is smaller than or equal to its right
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {

                //first occurrence
                result = mid;
                //search left half
                right = mid - 1;
            } else if (arr[mid] < target) {
                //search right half
                left = mid + 1;
            } else {
                //search left half
                right = mid - 1;
            }
        }
        return result;
    }

    //binary search for the last occurrence
    public static int findLastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        //run until left is smaller than or equal to its right
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                //last occurrence
                result = mid;
                //search right half
                left = mid + 1;
            } else if (arr[mid] < target) {
                //search right half
                left = mid + 1;
            } else {
                //search left half
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        //getting first and last occurrence
        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);

        //Printing result
        System.out.println("First occurrence of " + target + "- " + first);
        System.out.println("Last occurrence of " + target + "- " + last);
    }
}
