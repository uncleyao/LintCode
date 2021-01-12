class Solution:
    """
    @param nums: A list of integer which is 0, 1 or 2 
    @return: nothing
    """
    def sortColors(self, nums):
        # write your code here
        left,right = 0,len(nums)-1
        i = 0
        while i<=right:
            if nums[i]==0:
                nums[i],nums[left]= nums[left],nums[i]
                i+=1
                left+=1
            elif nums[i]==1:
                i+=1
            else:
                nums[i], nums[right] = nums[right],nums[i]
                right-=1
        