/*
An amicable pair (m,n) consists of two integers m,n for which the sum of proper divisors (the divisors excluding the number itself) of one number equals the other.

Given an integer k, find all amicable pairs between 1 and k.

Example
Example 1:

Input: 300
Output: [[220,284]]
Explanation:
Example 2:

Input: 220
Output: []
*/


public class Solution {
    /*
     * @param k: An integer
     * @return: all amicable pairs
     */
    public List<List<Integer>> amicablePair(int k) {
        // write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 1; i<=k;i++) {
            int amicable = getFactorSum(i);
            if (amicable<=i || amicable>k) {
                continue;
            }
            if (getFactorSum(amicable) == i) {
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(i);
                pair.add(amicable);
                result.add(pair);
            }
        }
        return result;
        
        
        
    }
    
    private int getFactorSum(int n) {
        int sum = 0;
        for (int i =2;i*i<=n;i++) {
            if (n%i==0) {
                sum = sum+i+n/i;
            }
        }
        sum+=1;
        return sum;
    }
}