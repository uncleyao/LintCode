/*
Given an array of integers, remove the duplicate numbers in it.

You should:

Do it in place in the array.
Move the unique numbers to the front of the array.
Return the total number of the unique numbers.
*/



public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        if (nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int len = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=nums[len]){
                nums[++len]=nums[i];
            }
            
        }
        return len+1;
    }
}