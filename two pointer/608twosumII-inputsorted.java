public class Solution {
    /**
     * @param nums: an array of Integer
     * @param target: target = nums[index1] + nums[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        int Left = 0, Right = nums.length-1;
        while (Left<Right){
            if (nums[Left]+nums[Right]==target){
                int[] result = {Left+1, Right+1};
                return result;
            }
            if (nums[Left]+nums[Right]<target){
                Left++;
            }
            else {Right--;}
        }
        
        int[] result = {};
        return result;
        
    }
}
