/*
给一个浮点数数组，求数组中的最大值。

Example
样例 1:

输入:  [1.0, 2.1, -3.3]
输出: 2.1	
样例解释: 返回最大的数字
样例 2:

输入:  [1.0, 1.0, -3.3]
输出: 1.0	
样例解释: 返回最大的数字。
*/


public class Solution {
    /**
     * @param A: An integer
     * @return: a float number
     */
    public float maxOfArray(float[] A) {
        // write your code here
        if (A.length ==0){
            return 0;
        }
        float maxium =A[0];
        int n = A.length;
        for (int i=0;i<n;i++){
            if (A[i]>maxium){
                maxium = A[i];
            }
        }
        return maxium;
    }
}