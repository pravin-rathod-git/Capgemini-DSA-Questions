public class UniqueElementFinder {

    // Method to find the element that occurs only once
    // Assumption: Every other element appears exactly twice
    public static int findUnique(int[] numbers) {
        
        int resultXor = 0;  // Will store XOR of all elements

        // XOR all elements
        for(int num : numbers) {
            resultXor ^= num; 
        }

        // The remaining value is the unique element
        return resultXor;
    }

    public static void main(String[] args) {
        
        // Sample array where every element appears twice except one
        int[] numbers = {4, 1, 2, 1, 2, 4, 7};

        // Find unique element
        int uniqueElement = findUnique(numbers);

        // Display result
        System.out.println("Element that occurs only once: " + uniqueElement);
    }
}
