public class InsertionSortAlgorithm {

    // Method to perform Insertion Sort
    public static void sort(int[] numbers) {
        
        int n = numbers.length;

        // Start from second element (first element is already sorted)
        for(int i = 1; i < n; i++) {
            
            int key = numbers[i];   // Element to be inserted
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while(j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // Insert key at correct position
            numbers[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = {12, 11, 13, 5, 6};

        // Perform Insertion Sort
        sort(numbers);

        // Display sorted array
        System.out.print("Sorted Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
