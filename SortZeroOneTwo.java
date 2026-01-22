// ---------- Brute Force Approach ----------
class BasicApproach {

    // Method to sort array containing only 0s, 1s, and 2s using counting
    public int[] bruteForceSort(int[] numbers) {
        
        int length = numbers.length;
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        // Count number of 0s, 1s, and 2s
        for(int i = 0; i < length; i++) {
            if(numbers[i] == 0) zeroCount++;
            else if(numbers[i] == 1) oneCount++;
            else twoCount++;
        }

        // Refill array based on counts
        int index = 0;
        while(zeroCount-- > 0) numbers[index++] = 0;
        while(oneCount-- > 0) numbers[index++] = 1;
        while(twoCount-- > 0) numbers[index++] = 2;

        return numbers;
    }
}


// ---------- Optimal Approach (Dutch National Flag Algorithm) ----------
public class SortZeroOneTwo {

    // Method to sort array using three-pointer approach
    public static void sortArray(int[] numbers) {
        
        int low = 0;                 // Position for next 0
        int mid = 0;                 // Current element
        int high = numbers.length - 1; // Position for next 2

        // Traverse until mid crosses high
        while(mid <= high) {
            
            if(numbers[mid] == 0) {
                // Swap with low pointer and move both forward
                int temp = numbers[mid];
                numbers[mid] = numbers[low];
                numbers[low] = temp;
                low++;
                mid++;
            }
            
            else if(numbers[mid] == 1) {
                // Correct place for 1, just move mid
                mid++;
            }
            
            else { // numbers[mid] == 2
                // Swap with high pointer and decrease high
                int temp = numbers[mid];
                numbers[mid] = numbers[high];
                numbers[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = {2, 0, 2, 1, 1, 0};

        // Sorting using optimal method
        sortArray(numbers);

        // Display result
        System.out.print("Sorted Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
