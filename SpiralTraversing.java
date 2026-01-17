public class SpiralTraversing {
    public static void Traversing(int arr[][]) {
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        Traversing(matrix);
    }
}
