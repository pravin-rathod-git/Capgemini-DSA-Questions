public class ZeroMover {

    // Method to move all zeros to the end of the array
    public static void moveZerosToEnd(int[] numbers) {
        
        int length = numbers.length;
        int nonZeroIndex = 0; // Points to position to place next non-zero element

        // Traverse array
        for(int i = 0; i < length; i++) {
            
            // If current element is non-zero
            if(numbers[i] != 0) {
                
                // Swap current element with element at nonZeroIndex
                int temp = numbers[nonZeroIndex];
                numbers[nonZeroIndex] = numbers[i];
                numbers[i] = temp;
                
                nonZeroIndex++; // Move pointer forward
            }
        }
    }

    public static void main(String[] args) {
        
        // Sample input array
        int[] numbers = {0, 1, 0, 3, 12, 0, 5};

        // Move zeros to end
        moveZerosToEnd(numbers);

        // Display result
        System.out.print("Array after moving zeros: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
