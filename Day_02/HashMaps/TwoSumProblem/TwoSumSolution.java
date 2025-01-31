package HashMaps.TwoSumProblem;
import java.util.HashMap;

//Two sum class
public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        //using hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        //return empty array if no solution found
        return new int[]{};
    }
}