package HashMaps.TwoSumProblem;

//main class
public class TwoSumMain {
    public static void main(String[] args) {
        //create object
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
