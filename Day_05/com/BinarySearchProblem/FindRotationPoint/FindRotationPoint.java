package com.BinarySearchProblem.FindRotationPoint;
public class FindRotationPoint {

    //using method to find the rotation point
    static int rotationPoint(int rotatedArr[], int n){
        int left = 0;
        int right = n-1;

        //run until left is smaller the right
        while(left < right){
            int mid = (left + right)/2;
            if(rotatedArr[mid] > right){
                left = mid + 1;
            }
            else if(rotatedArr[mid] < right){
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int rotatedArr[] = {7,8,9,0,1,2,3,4,5,6};
        int n = rotatedArr.length;
        int rotationIndex = rotationPoint(rotatedArr, n);

        //displaying results
        System.out.println("rotation point index - " + rotationIndex);
        System.out.println("Smallest element in rotated array - " + rotatedArr[rotationIndex]);

    }
}

