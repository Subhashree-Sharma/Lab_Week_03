package org.example.com.ComparingDifferentDataStructures;
public class ArraySearch {

    //searching in array
    public static boolean searchInArray(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

