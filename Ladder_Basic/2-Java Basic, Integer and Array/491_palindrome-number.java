/*
判断一个正整数是不是回文数。

*/


public class Solution {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        if (num<0){
            return true;
        }
        return num == reverse(num);
    }
    
    public int reverse(int x){
        int result = 0;
        while (x>0){
            result = result*10+ x%10;
            x=x/10;
        }
        return result;
    }
}