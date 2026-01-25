public class BubbleSortAlgorithm {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] numbers) {
        
        int n = numbers.length;

        // Outer loop for number of passes
        for(int i = 0; i < n - 1; i++) {
            
            boolean swapped = false; // Optimization flag

            // Inner loop for adjacent comparisons
            for(int j = 0; j < n - i - 1; j++) {
                
                // Swap if elements are in wrong order
                if(numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swap occurred, array is already sorted
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = {5, 1, 4, 2, 8};

        // Perform Bubble Sort
        bubbleSort(numbers);

        // Display sorted array
        System.out.print("Sorted Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

