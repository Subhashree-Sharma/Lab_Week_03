package com.SlidingWindow;
import java.util.Arrays;

//main class
public class SlidingWindowMaximum {

        public static void main(String[] args) {
            int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;

            int[] result = SlidingWindow.maxSlidingWindow(nums, k);

            System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
        }
    }


