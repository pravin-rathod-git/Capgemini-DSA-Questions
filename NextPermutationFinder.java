public class NextPermutationFinder {

    // Method to find the next lexicographical permutation
    public static void findNextPermutation(int[] numbers) {
        
        int n = numbers.length;
        int index = -1;

        // Step 1: Find the first index from right where numbers[i] < numbers[i+1]
        for(int i = n - 2; i >= 0; i--) {
            if(numbers[i] < numbers[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such index, array is in descending order
        // Reverse entire array to get smallest permutation
        if(index == -1) {
            reverse(numbers, 0, n - 1);
            return;
        }

        // Step 2: Find element just greater than numbers[index] from right
        for(int i = n - 1; i > index; i--) {
            if(numbers[i] > numbers[index]) {
                // Swap
                int temp = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = temp;
                break;
            }
        }

        // Step 3: Reverse the subarray after index
        reverse(numbers, index + 1, n - 1);
    }

    // Method to reverse array elements between given indices
    private static void reverse(int[] numbers, int start, int end) {
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3};

        // Find next permutation
        findNextPermutation(numbers);

        // Display result
        System.out.print("Next Permutation: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
