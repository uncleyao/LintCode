/* Find the Nth number in Fibonacci sequence. */

public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n==1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        int[] result = new int[n];
        result[0] =0;
        result[1] =1;
        for (int i=2;i<n;i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n-1];

    }
}