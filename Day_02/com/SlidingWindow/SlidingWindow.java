package com.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

//sliding window class
public class SlidingWindow {
        public static int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || k <= 0) {
                return new int[0];
            }

            int n = nums.length;
            int[] result = new int[n - k + 1];
            Deque<Integer> dq = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                // Remove elements outside of the current window
                if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                    dq.pollFirst();
                }

                // Remove elements from the back that are smaller than current element
                while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                    dq.pollLast();
                }

                // Add the current index
                dq.offerLast(i);

                // Store the max value (only after filling the first window)
                if (i >= k - 1) {
                    result[i - k + 1] = nums[dq.peekFirst()];
                }
            }

            return result;
        }
    }

