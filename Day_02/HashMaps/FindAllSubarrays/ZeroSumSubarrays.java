package HashMaps.FindAllSubarrays;
import java.util.*;
//zero sum sub array class
public class ZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Initialize with sum = 0 at index -1 (to capture subarrays starting from index 0)
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update cumulative sum

            // If sum already exists in the map, it means we found zero-sum subarrays
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            // Store the index for this sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return result;
    }
}

