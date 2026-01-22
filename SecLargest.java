public class SecLargest {
    
    // Method to find the second largest element in the array
    public static int SecondLargest(int arr[]) {
        
        int n = arr.length;                 // Store length of array
        int largest = Integer.MIN_VALUE;    // Initialize largest with smallest possible integer
        int secLargest = Integer.MIN_VALUE; // Initialize second largest

        // Traverse through the array
        for(int i = 0; i < n; i++) {
            
            // If current element is greater than largest
            if(arr[i] > largest) {
                secLargest = largest; // Previous largest becomes second largest
                largest = arr[i];     // Update largest
            }
            
            // If current element is between largest and second largest
            else if(arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];  // Update second largest
            }
        }
        
        // Return the second largest element
        return secLargest;
    }

    public static void main(String[] args) {
        
        // Hardcoded array
        int[] arr = {10, 20, 50, 60, 40, 80};
        
        // Calling method and printing result
        System.out.println(SecondLargest(arr));
    }
}
