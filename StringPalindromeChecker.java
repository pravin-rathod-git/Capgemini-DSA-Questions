public class StringPalindromeChecker {

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String text) {
        
        int left = 0;                 // Starting index
        int right = text.length() - 1; // Ending index

        // Compare characters from both ends
        while(left < right) {
            if(text.charAt(left) != text.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        
        String text = "madam";

        // Check palindrome
        boolean result = isPalindrome(text);

        if(result)
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }
}
