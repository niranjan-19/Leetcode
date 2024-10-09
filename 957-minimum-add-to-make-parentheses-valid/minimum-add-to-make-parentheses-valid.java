class Solution {
    public int minAddToMakeValid(String s) {
        // Variables to keep track of required '(' and ')'
        int openNeeded = 0, closeNeeded = 0;

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {
            // If it's an opening parenthesis
            if (ch == '(') {
                openNeeded++;
            }
            // If it's a closing parenthesis
            else {
                // If there's no matching opening, we need an additional opening
                if (openNeeded == 0) {
                    closeNeeded++;
                } else {
                    // If there's a matching opening, reduce the need for '('
                    openNeeded--;
                }
            }
        }

        // The result is the total of unmatched '(' and unmatched ')'
        return openNeeded + closeNeeded;
    }
}