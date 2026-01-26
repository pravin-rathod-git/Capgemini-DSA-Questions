public class RemoveOuterParentheses {

    // Method to remove outermost parentheses from every primitive substring
    public static String removeParentheses(String s) {
        
        StringBuilder result = new StringBuilder();
        int balance = 0; // Keeps track of open parentheses count

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character is '('
            if(ch == '(') {
                // Append '(' only if it's NOT an outermost parenthesis
                if(balance > 0) {
                    result.append(ch);
                }
                balance++;
            }
            else { // ch == ')'
                balance--;
                // Append ')' only if it's NOT an outermost parenthesis
                if(balance > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        String s = "(()())(())(()(()))";

        String output = removeParentheses(s);

        System.out.println("After removing outer parentheses: " + output);
    }
}
