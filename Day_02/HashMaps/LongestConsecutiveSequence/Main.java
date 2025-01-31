package HashMaps.LongestConsecutiveSequence;

//main class
public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        int longestSequence = LongestConsecutiveSequence.findLongestConsecutiveSequence(arr);
        System.out.println("Longest Consecutive Sequence Length: " + longestSequence);
    }
}
