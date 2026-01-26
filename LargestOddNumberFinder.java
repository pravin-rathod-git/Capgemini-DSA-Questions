public class LargestOddNumberFinder {

    // Method to find largest odd number from numeric string
    public static String findLargestOdd(String s) {
        
        int n = s.length();

        // Traverse from right to left to find last odd digit
        for(int i = n - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';

            // If odd digit found
            if(digit % 2 != 0) {
                return customSubstring(s, 0, i + 1);
            }
        }

        // No odd digit found
        return "";
    }

    // Custom substring method (manual implementation)
    public static String customSubstring(String s, int start, int end) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        
        String s = "3542708";

        String result = findLargestOdd(s);

        System.out.println("Largest Odd Number: " + result);
    }
}
