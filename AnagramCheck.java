public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {

        // If lengths differ, they can't be anagrams
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        // Frequency array for 26 lowercase English letters
        int[] freq = new int[26];

        // Increment for s1, decrement for s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        // If all counts return to zero → anagram
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    // Test
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("rat", "car"));       // false
    }
}
