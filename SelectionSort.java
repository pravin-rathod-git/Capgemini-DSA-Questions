public class SelectionSort {

    // Method to perform Selection Sort
    public static void sort(int[] numbers) {
        
        int n = numbers.length;

        // Outer loop selects the position to place the minimum element
        for(int i = 0; i < n - 1; i++) {
            
            int minIndex = i; // Assume current index holds minimum value

            // Find the index of minimum element in remaining unsorted array
            for(int j = i + 1; j < n; j++) {
                if(numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with element at position i
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = {29, 10, 14, 37, 13};

        // Perform selection sort
        sort(numbers);

        // Display sorted array
        System.out.print("Sorted Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

