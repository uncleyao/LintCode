/*
判断一个正整数是不是回文数。

回文数的定义是，将这个数反转之后，得到的数仍然是同一个数。

Example
例1：

输入：11
输出：true

例2：

输入：1232
输出：false
解释：
1232!=2321
Notice
给的数一定保证是32位正整数，但是反转之后的数就未必了。
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