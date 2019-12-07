public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    
    public void moveZeroes(int[] nums) {
        // write your code here
        
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left+=1;
            }
            right+=1;
        }
        while (left < nums.length) {
            nums[left] =0;
            left+=1;
        }
    }
}
