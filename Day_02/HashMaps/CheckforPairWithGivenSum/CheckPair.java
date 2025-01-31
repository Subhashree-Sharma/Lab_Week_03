package HashMaps.CheckforPairWithGivenSum;
import java.util.*;
//check pair class
public class CheckPair {
    //using method to check pair
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        //iterate
        for (int num : arr) {
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            seenNumbers.add(num);
        }

        System.out.println("No pair found with sum " + target);
        return false;
    }
}
