/*
Find K-th largest element in an array.

Example
Example 1:

Input:
n = 1, nums = [1,3,4,2]
Output:
4
Example 2:

Input:
n = 3, nums = [9,3,2,4,8]
Output:
4
Challenge
O(n) time, O(1) extra memory.

*/

public class Solution {
    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        if (n<=0 || nums.length<n) {
            return -1;
        }
        return kthSearch(nums, 0, nums.length-1, nums.length-n);
        
    }
    
    private int kthSearch(int[] nums, int start, int end, int k) {
        if (start>=end) {
            return nums[k];
        }
        int i = start, j = end;
        int pivot = nums[start+ (end-start)/2];
        while (i<=j) {
            while (i<=j && nums[i] < pivot) {
                i++;
            }
            while (i<=j && nums[j]> pivot ){
                j--;
            }
            if (i<=j) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            }
        }
        if (k<=j) {
            return kthSearch(nums, start,j,k);
        }
        if (k>=i) {
            return kthSearch(nums, i, end, k);
        }
        
        return nums[k];
        
    }
    
    
}