import java.util.HashMap;

public class IsomorphicString {

    public static boolean isIsomorphic(String s1, String s2) {

        // If lengths differ, they cannot be isomorphic
        if (s1.length() != s2.length()) return false;

        // Maps to store character mappings both ways
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            // Check existing mapping from s1 → s2
            if (map1.containsKey(ch1) && map1.get(ch1) != ch2) {
                return false;
            }

            // Check reverse mapping from s2 → s1
            if (map2.containsKey(ch2) && map2.get(ch2) != ch1) {
                return false;
            }

            // Store new mappings
            map1.put(ch1, ch2);
            map2.put(ch2, ch1);
        }

        return true;
    }

    // Test
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
    }
}
