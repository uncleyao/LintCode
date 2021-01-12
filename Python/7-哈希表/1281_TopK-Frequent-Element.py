class Solution:
    """
    @param nums: the given array
    @param k: the given k
    @return: the k most frequent elements
    """
    def topKFrequent(self, nums, k):
        # Write your code here
        freq_dict = {}
        for num in nums:
            freq_dict[num] = freq_dict.get(num,0)+1
            
        freq_dict_sorted = sorted(freq_dict.items(), key=lambda x: x[1], reverse=True)
        ret = []
        for i in range(k):
            ret.append(freq_dict_sorted[i][0])
        return ret