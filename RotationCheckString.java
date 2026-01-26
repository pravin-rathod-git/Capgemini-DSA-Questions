public class RotationCheckString {

    public static boolean checkRotation(String s1, String s2) {

        // If lengths differ, cannot be rotations
        if (s1.length() != s2.length()) return false;

        // Concatenate s1 with itself
        String temp = s1 + s1;

        int n = temp.length();

        // Try matching s2 starting from each position
        for (int i = 0; i <= n - s2.length(); i++) {
            int j = 0;
            int index = i;

            while (j < s2.length() && temp.charAt(index) == s2.charAt(j)) {
                j++;
                index++;
            }

            // If full string matched
            if (j == s2.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkRotation("abcd", "cdab")); // true
        System.out.println(checkRotation("abcd", "acbd")); // false
    }
}
