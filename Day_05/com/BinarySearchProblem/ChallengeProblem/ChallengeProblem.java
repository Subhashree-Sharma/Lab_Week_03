package com.BinarySearchProblem.ChallengeProblem;
import java.util.Arrays;
public class ChallengeProblem {

        //using method to find first missing positive element
        public static int findFirstMissingPositive(int[] arr) {
            int n = arr.length;

            //mark numbers out of range and place numbers in their correct positions
            for (int i = 0; i < n; i++) {
                while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {

                    //swap arr[i] with the correct position (arr[arr[i] - 1])
                    int temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                }
            }

            //find the first missing positive integer
            for (int i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }
            //if all numbers from 1 to n are present, return n + 1
            return n + 1;
        }
        //using method to perform Binary Search for a target number
        public static int binarySearch(int[] arr, int target) {

            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    //target found, return index
                    return mid;
                } else if (arr[mid] < target) {
                    //search right half
                    left = mid + 1;
                } else {
                    //search left half
                    right = mid - 1;
                }
            }

            //target found
            return -1;
        }

        public static void main(String[] args) {
            int[] nums = {3, 4, -1, 1};

            //finding the first missing positive integer
            int missingNumber = findFirstMissingPositive(nums);
            System.out.println("First missing positive integer- " + missingNumber);

            //sorting the array for binary search
            Arrays.sort(nums);
            System.out.println("Sorted array - " + Arrays.toString(nums));

            //finding the target index using Binary Search
            int target = 3;
            int targetIndex = binarySearch(nums, target);
            System.out.println("Index of " + target + " - " + targetIndex);
        }
    }
