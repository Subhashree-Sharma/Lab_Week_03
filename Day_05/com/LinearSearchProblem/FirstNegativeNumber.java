package com.LinearSearchProblem;

public class FirstNegativeNumber {

    //using method to find first negative element
        public static int findFirstNegative(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    //return the index of the first negative number
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] numbers = {3, 5, 7, -2, 8, -6, 10};
            int result = findFirstNegative(numbers);

            //displaying result
            if (result != -1) {
                System.out.println("First negative number found at index -: " + result);
            } else {
                System.out.println("No negative number found.");
            }
        }
    }





