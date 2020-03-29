/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example
Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama"
Example 2:

Input: "race a car"
Output: false
Explanation: "raceacar"
Challenge
O(n) time without extra memory.
*/



public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if (s == null || s.length()==0){
            return true; 
        }
        int left = 0;
        int right = s.length()-1;
        while (left< right){
            while (left<s.length() && !isChar(s.charAt(left))) {
                left++;
            }
            if (left == s.length()) {
                return true;
            }
            while (right>=0 && !isChar(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
    
    private boolean isChar(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}