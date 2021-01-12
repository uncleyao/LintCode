class Solution:
    """
    Given a list of numbers, return all possible permutations.
    """
    def permute(self, nums):
        # write your code here
        result = []
        self.get_permute(nums, [],result)
        return result
    
    def get_permute(self, nums, current, result):
        length = len(nums)
        if length==0:
            result.append(current)
        for ind, val in enumerate(nums):
            self.get_permute(nums[:ind]+nums[ind+1:],current+[val],result)