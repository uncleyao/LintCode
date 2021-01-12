class Solution:
    """
    @param n: the integer to be reversed
    @return: the reversed integer
    """
    def reverseInteger(self, n):
        # write your code here
        result = 0
        while n!=0:
            ## pyhon里负数取模和java不一样
            mode = 0
            if n>0:
                mode = n%10
            else:
                mode =  n%-10
            temp = result*10+mode
            n = int(n/10)
            if int(temp/10) != result:
                return 0
            else:
                result = temp
        if result < -(1 << 31) or result > (1 << 31) - 1:
            return 0
        return result