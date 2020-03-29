/*
Given an integer array, find a subarray with sum closest to zero. Return the indexes of the first number and last number.

Example
Example1

Input: 
[-3,1,1,-3,5] 
Output: 
[0,2]
Explanation: [0,2], [1,3], [1,1], [2,2], [0,4]
Challenge
O(nlogn) time

*/


class Pair {
    int index;
    int sum;
    public Pair(int s, int i) {
        sum = s;
        index =i;
    }
}

public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public int[] subarraySumClosest(int[] nums) {
        // write your code here
        int[] result = new int[2];
        if (nums==null || nums.length==0) {
            return result;
        }
        
        
        Pair[] prexSum = new Pair[nums.length+1];
        prexSum[0] = new Pair(0,0);
        int prev =0;
        // get array of presum with index (+1)
        for (int i =1;i<nums.length+1;i++) {
            prexSum[i]  = new Pair(prev+nums[i-1],i);
            prev+=nums[i-1];
        }
        
        Arrays.sort(prexSum, new Comparator<Pair>(){
            public int compare(Pair a, Pair b) {
                return a.sum-b.sum;
            }
        });
        

        int smallest = Integer.MAX_VALUE;
        for (int i =1;i<=nums.length;i++) {
            if (smallest>prexSum[i].sum-prexSum[i-1].sum) {
                smallest = prexSum[i].sum-prexSum[i-1].sum;
                int[] temp = new int[]{prexSum[i].index-1, prexSum[i-1].index-1 };
                Arrays.sort(temp);
                result[0]  = temp[0]+1;
                result[1]  = temp[1];
            }
        }
        

        return result;

    }
}