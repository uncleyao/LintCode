"""
Definition of Interval.
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    """
    @param intervals: interval list.
    @return: A new interval list.
    """
    def merge(self, intervals):
        # write your code here
        if not intervals:
            return []
        intervals.sort(key = lambda x:x.start)
        result = [intervals[0]]
        for cur in intervals[1:]:
            pre = result[-1]
            if cur.start<=pre.end:
                pre.end = max(pre.end,cur.end)
            else:
                result.append(cur)
        return result