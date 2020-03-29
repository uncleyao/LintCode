/*
Reverse digits of an integer. Returns 0 when the reversed integer overflows (signed 32-bit integer).

Example
Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
*/

public class Solution {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        // write your code here
        int result = 0;
        while (n!=0) {
            int temp = result*10 + n%10;
            n = n/10;
            if (temp/10 != result) {
                return 0;
            }
            else {result = temp;}
  
        }
        return  result;
    }
}