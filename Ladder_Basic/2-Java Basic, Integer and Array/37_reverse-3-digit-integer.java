import java.lang.Math;

public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     * 反转一个只有3位数的整数。

* Example
* 样例 1:

* 输入: number = 123
* 输出: 321
* 样例 2:

* 输入: number = 900
* 输出: 9
* otice
* 你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。
     */
    public int reverseInteger(int number) {
        // write your code here
        int result = 0;
        for (int i = 1;i<4;i++){
            result += (number % 10) *Math.pow(10,3-i);
            number = number / 10;
        }

        return result;
    }
}