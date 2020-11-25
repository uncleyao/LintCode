/*
给出0，1，2的乱序，内部排成从0，到1，到2的顺序

Example
Example 1

Input : [1, 0, 1, 2]
Output : [0, 1, 1, 2]
Explanation : sort it in-place

*/

public class Solution {

    public void sortColors(int[] nums) {
        // write your code here
        int left = 0, right = nums.length-1;
        int i =0;
        while (i <= right) {
            if (nums[i]==0) {
                swap(nums, i++,left++);
            }
            else if (nums[i]==1) {
                i++;
            }
            else {
                swap(nums, i, right--);
            }
        }
    }
    
    private void swap(int[] nums, int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}