import java.util.HashMap;

public class LongestSubarraySumK {

    // Method to find length of longest subarray with sum = k
    public static int findLongestSubarray(int[] numbers, int k) {
        
        int prefixSum = 0;                // Stores cumulative sum
        int maxLength = 0;                // Stores maximum length found
        HashMap<Integer, Integer> map = new HashMap<>();
        // map stores: prefixSum -> first index where it occurs

        for(int i = 0; i < numbers.length; i++) {
            
            prefixSum += numbers[i];

            // Case 1: If prefixSum itself equals k
            if(prefixSum == k) {
                maxLength = i + 1;
            }

            // Case 2: If (prefixSum - k) was seen before
            if(map.containsKey(prefixSum - k)) {
                int startIndex = map.get(prefixSum - k);
                int length = i - startIndex;
                maxLength = Math.max(maxLength, length);
            }

            // Store prefixSum only if it is not already present
            // (to keep the earliest index)
            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        
        // Sample array
        int[] numbers = {10, 5, 2, 7, 1, 9};
        int k = 15;

        // Find longest subarray
        int result = findLongestSubarray(numbers, k);

        // Display output
        System.out.println("Length of longest subarray with sum " + k + " is: " + result);
    }
}
