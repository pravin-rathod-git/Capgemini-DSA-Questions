import java.util.*;

public class LongestSubstring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        HashSet<Character> set = new HashSet<>();
        
        int start = 0, end = 0;
        int maxLen = 0;
        int startIndex = 0;
        
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                if (end - start + 1 > maxLen) {
                    maxLen = end - start + 1;
                    startIndex = start;
                }
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        
        System.out.println("Longest Substring: " + s.substring(startIndex, startIndex + maxLen));
        System.out.println("Length = " + maxLen);
        
        sc.close();
    }
}
