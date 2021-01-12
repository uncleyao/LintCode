class Solution:
    """
    @param: :  A list of integers
    @return: A list of unique permutations
    """

    def permuteUnique(self, nums):
        # write your code here
        result = []
        nums = sorted(nums)
        self.get_permute(nums, [], result)
        return result
        
    def get_permute(self, nums, current, result):
        if not nums:
            result.append(current)
        ind = 0
        while ind < len(nums):
            self.get_permute(nums[:ind]+nums[ind+1:],current+[nums[ind]],result)
            while ind<len(nums)-1 and nums[ind]==nums[ind+1]:
                ind+=1 
            ind+=1