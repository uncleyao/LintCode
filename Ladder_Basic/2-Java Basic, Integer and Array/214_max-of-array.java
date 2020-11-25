/*
给一个浮点数数组，求数组中的最大值。
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