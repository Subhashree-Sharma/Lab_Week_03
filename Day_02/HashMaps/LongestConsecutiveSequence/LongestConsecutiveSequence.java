package HashMaps.LongestConsecutiveSequence;
import java.util.HashSet;
public class LongestConsecutiveSequence {
    //using method to find longestConsecutive Sequence
    public static int findLongestConsecutiveSequence(int[] arr) {
        if (arr.length == 0) return 0;

        //hashset
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : arr) {
            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        //returning max length
        return maxLength;
    }
}

