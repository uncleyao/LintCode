/*
For example the 3-digit decimal number 153 is a narcissistic number because 153 = 13 + 53 + 33.

And the 4-digit decimal number 1634 is a narcissistic number because 1634 = 14 + 64 + 34 + 44.

Given n, return all narcissistic numbers with n digits.

Example
Example 1:

Input: 1
Output: [0,1,2,3,4,5,6,7,8,9]
Example 2:

Input:  2
Output: []
Explanation: There is no Narcissistic Number with 2 digits.
*/


public class Solution {
    /**
     * @param n: The number of digits
     * @return: All narcissistic numbers with n digits
     */
    public List<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        List<Integer> result = new ArrayList<Integer>();
        int minN = (int) Math.pow(10,n-1);
        if (n==1){
            minN = 0;
        }
        int maxN =  (int) Math.pow(10,n);
        for (int i = minN; i < maxN;i++) {
            if (i==narciss(i,n)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    private int narciss(int k,int n) {
        int sum =0;
        while (k!=0) {
            sum = sum + (int) Math.pow(k%10,n);
            k = k/10;
        }
        return sum;
    }
}