public class KadaneAlgorithm {

    // Method to find maximum subarray sum
    public static int maxSubArraySum(int[] numbers) {
        
        int currentSum = 0;                 // Stores running sum
        int maxSum = Integer.MIN_VALUE;     // Stores maximum sum found

        // Traverse array
        for(int num : numbers) {
            
            // Add current element to running sum
            currentSum += num;

            // Update maxSum if currentSum is greater
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If running sum becomes negative, reset it
            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum; // Return maximum subarray sum
    }

    public static void main(String[] args) {
        
        // Sample array (contains negative and positive numbers)
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Find maximum subarray sum
        int result = maxSubArraySum(numbers);

        // Display result
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
