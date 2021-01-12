import functools

class Solution:
    """
    @param nums: A list of non negative integers
    @return: A string
    """
    # 比较函数
    def compare(self, a,b):
        if a+b>b+a:
            return -1
        return 1
    def largestNumber(self, nums):
        # write your code here
        string = []
        for i in nums:
            string.append(str(i))
        string.sort(key = functools.cmp_to_key(self.compare))
        ans = ""
        for i in string:
            ans+=i
        if ans[0]=='0':
            return "0"
        return ans