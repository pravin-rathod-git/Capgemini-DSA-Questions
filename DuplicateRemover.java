public class DuplicateRemover {

    // Method to remove duplicates from a sorted array
    // Returns the count of unique elements
    public static int removeDuplicates(int[] numbers) {
        
        int length = numbers.length;  // Store array length
        int uniqueIndex = 0;          // Index of last unique element

        // Traverse array starting from second element
        for(int i = 1; i < length; i++) {
            
            // If current element is different from last unique element
            if(numbers[i] != numbers[uniqueIndex]) {
                uniqueIndex++; // Move unique index forward
                
                // Swap to place unique element at correct position
                int temp = numbers[i];
                numbers[i] = numbers[uniqueIndex];
                numbers[uniqueIndex] = temp;
            }
        }

        // Return total number of unique elements
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        
        // Sorted array with duplicates
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};

        // Call method
        int uniqueCount = removeDuplicates(numbers);

        // Display result
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Array after removing duplicates: ");

        // Print unique elements
        for(int i = 0; i < uniqueCount; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
