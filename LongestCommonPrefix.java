public class LongestCommonPrefix {

    public static String LongestPrefix(String[] s) {
        // If array is empty, return empty prefix
        if (s == null || s.length == 0) return "";

        int n = s.length;

        // Assume first string as prefix
        String prefix = s[0];

        // Compare prefix with each string
        for (int i = 1; i < n; i++) {
            String current = s[i];
            int j = 0;

            // Compare characters until mismatch or end of any string
            while (j < prefix.length() && j < current.length()
                    && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }

            // If no common character found
            if (j == 0) {
                return "";
            }

            // Update prefix to matched part
            prefix = prefix.substring(0, j);
        }

        return prefix;
    }

    // Driver code for testing
    public static void main(String[] args) {
        String[] arr = {"Pravin", "Pratiksha"};
        System.out.println("The Longest common prefix between Pravin and Pratiksha is...");
        System.out.println(LongestPrefix(arr)); // Output: "fl"
        System.out.println("Pravin loves more....");
    }
}
