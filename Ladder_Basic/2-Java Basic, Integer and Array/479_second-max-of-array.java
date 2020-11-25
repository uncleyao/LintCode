/*
Find the second max number in a given array.

*/

public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        if (nums.length <=1) return 0;

        int maxNum = Math.max(nums[0],nums[1]);
        int secondNum = Math.min(nums[0], nums[1]);
        for (int i=2;i<nums.length;i++) {
            if (nums[i] > maxNum) {
                secondNum = maxNum;
                maxNum = nums[i];
            }
            else if (nums[i]> secondNum) {
                secondNum = nums[i];
            }
            
        }
        return secondNum;
    }
}