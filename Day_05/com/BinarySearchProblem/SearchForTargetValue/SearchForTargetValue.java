package com.BinarySearchProblem.SearchForTargetValue;

public class SearchForTargetValue {
    //using method to check if target element is there or not
    public static boolean searchMatrix(int[][] matrix, int target) {

        //if invalid then return false
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        //run until left is smaller than or equal to right
        while (left <= right) {
            int mid = left + (right - left) / 2;

            //convert 1D index to 2D row and column
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            // Target found
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                //Search right half
                left = mid + 1;
            } else {
                //Search left half
                right = mid - 1;
            }
        }
        // Target not found
        return false;
    }

    //main method
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 20;

        boolean found = searchMatrix(matrix, target);
        //display result
        System.out.println("Target " + target + " found -  " + found);
    }
}

