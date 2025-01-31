package HashMaps.FindAllSubarrays;

//main class
public class ZeroSumSubarraysMain {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, -6, -2, 2, 1};

        // Call the function and get results
        var result = ZeroSumSubarrays.findZeroSumSubarrays(arr);

        // Print the found subarrays
        for (int[] subarray : result) {
            System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
        }
    }
}
