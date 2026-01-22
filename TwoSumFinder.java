import java.util.ArrayList;

public class TwoSumFinder {

    // Method to find two indices whose elements sum to target
    // Assumption: Input array is sorted
    public static ArrayList<Integer> findTwoSum(int[] numbers, int targetSum) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;                   // Starting pointer
        int right = numbers.length - 1; // Ending pointer

        // Two-pointer traversal
        while(left < right) {
            
            int currentSum = numbers[left] + numbers[right];

            // If required sum found
            if(currentSum == targetSum) {
                result.add(left);   // Add left index
                result.add(right);  // Add right index
                return result;      // Return indices immediately
            }
            
            // If sum is smaller, move left pointer forward
            else if(currentSum < targetSum) {
                left++;
            }
            
            // If sum is larger, move right pointer backward
            else {
                right--;
            }
        }

        // If no pair found, return empty list
        return result;
    }

    public static void main(String[] args) {
        
        // Sorted input array
        int[] numbers = {2, 4, 6, 8, 9, 11};
        int targetSum = 14;

        // Find two sum
        ArrayList<Integer> indices = findTwoSum(numbers, targetSum);

        // Display result
        if(indices.isEmpty()) {
            System.out.println("No pair found with given sum.");
        } else {
            System.out.println("Pair found at indices: " + indices);
            System.out.println("Values: " + numbers[indices.get(0)] 
                               + " + " + numbers[indices.get(1)]);
        }
    }
}
