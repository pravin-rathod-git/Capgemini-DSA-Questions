public class MatrixIdentityCheck {
    public static void main(String[] args) {
        
        int[][] A = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}
        };
        
        int[][] B = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}
        };
        
        boolean identical = true;
        
        // Check dimensions
        if (A.length != B.length || A[0].length != B[0].length) {
            identical = false;
        } 
        else {
            // Compare elements
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    if (A[i][j] != B[i][j]) {
                        identical = false;
                        break;
                    }
                }
            }
        }
        
        if (identical)
            System.out.println("Matrices are identical");
        else
            System.out.println("Matrices are not identical");
    }
}
