class Solution:


    def twoSum(self, numbers, target):
        # HashMap算法

        hash = {}
        for i in range(len(numbers)):
            if target- numbers[i] in hash:
                return [hash[target-numbers[i]], i]
            hash[numbers[i]]=i
        # 无解情况
        return [-1,-1]


        def twoSum(self, numbers, target):
        #  双指针算法
        if not numbers:
            return [-1,-1]
        nums = [(number , index ) for index, number in enumerate(numbers)]
        nums = sorted(nums)
        # 双指针先排序
        left, right = 0,len(nums)-1
        while left <right:
            if nums[left][0] + nums[right][0]>target:
                right-=1
            elif nums[left][0]+nums[right][0]< target:
                left+=1
            else:
                return sorted([nums[left][1],nums[right][1]])
        return [-1,-1]