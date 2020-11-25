/*
Reverse digits of an integer. Returns 0 when the reversed integer overflows (signed 32-bit integer).

Input: 123
Output: 321

Input: -123
Output: -321
*/

public class Solution {

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