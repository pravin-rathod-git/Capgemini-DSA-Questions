public class ArrayLeftRotation {

    // Method to left rotate array by d positions using reversal algorithm
    public static void rotateLeft(int[] numbers, int d) {
        
        int length = numbers.length;
        
        // Handle cases where d > length
        d = d % length;

        // Step 1: Reverse first d elements
        reverse(numbers, 0, d - 1);

        // Step 2: Reverse remaining elements
        reverse(numbers, d, length - 1);

        // Step 3: Reverse entire array
        reverse(numbers, 0, length - 1);
    }

    // Method to reverse array elements between given indices
    public static void reverse(int[] numbers, int start, int end) {
        
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int d = 2; // Rotate left by 2 positions

        // Perform rotation
        rotateLeft(numbers, d);

        // Display rotated array
        System.out.print("Array after left rotation: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
