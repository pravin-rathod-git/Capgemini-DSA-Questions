public class RotatedSortedChecker {

    // Method to check whether an array is sorted and rotated
    public static boolean isSortedAndRotated(int[] numbers) {
        
        int length = numbers.length;     // Stores array length
        int breakCount = 0;               // Counts order-breaking points

        // Traverse array in circular manner
        for(int i = 0; i < length; i++) {
            
            // Compare current element with next (circular indexing)
            if(numbers[i] > numbers[(i + 1) % length]) {
                breakCount++;  // Found a break in ascending order
                
                // More than one break means not sorted & rotated
                if(breakCount > 1) {
                    return false;
                }
            }
        }
        return true; // Exactly one or zero break → sorted and rotated
    }

    public static void main(String[] args) {
        
        // Sample input array
        int[] numbers = {4, 5, 6, 7, 1, 2, 3};

        // Check if array is sorted and rotated
        boolean isValid = isSortedAndRotated(numbers);

        // Display result
        if(isValid)
            System.out.println("The array is sorted and rotated.");
        else
            System.out.println("The array is NOT sorted and rotated.");
    }
}
