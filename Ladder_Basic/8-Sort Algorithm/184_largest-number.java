/*
Given a list of non negative integers, arrange them such that they form the largest number.

Example
Example 1:

Input:[1, 20, 23, 4, 8]
Output:"8423201"
Example 2:

Input:[4, 6, 65]
Output:"6654"
Challenge
Do it in O(nlogn) time complexity.

*/

public class Solution {
    /**
     * @param nums: A list of non negative integers
     * @return: A string
     */
     
    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        };
    public String largestNumber(int[] nums) {
        // write your code here
        String[] str = new String[nums.length];
        for (int i =0;i<nums.length;i++) {
            str[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(str, comparator);
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<str.length;i++) {
            sb.append(str[i]);
        }
        String result = sb.toString();
        //remove head 0s
        int index = 0;
        while (index<result.length() && result.charAt(index) == '0' ){
            index++;
        }
        if (index==result.length()) {
            return "0";
        }
        return result.substring(index);
    }
    
}