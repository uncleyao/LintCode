/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        Stack<Character> stacks = new Stack<Character>();
        for (Character c: s.toCharArray()) {
            if ("({[".contains(String.valueOf(c)) ){
                stacks.push(c);
            } else {
                if (!stacks.isEmpty() && isValid(stacks.peek(), c)) {
                    stacks.pop();
                }
                else return false;
            }
        }
        return stacks.isEmpty();
    }
    
    private boolean isValid(char c1, char c2) {
        return (c1=='(' && c2 == ')') || (c1=='[' && c2 == ']') || (c1=='{' && c2 == '}');
    }
}