/*
Given a collection of intervals, merge all overlapping intervals.

Example
Example 1:

Input: [(1,3)]
Output: [(1,3)]
Example 2:

Input:  [(1,3),(2,6),(8,10),(15,18)]
Output: [(1,6),(8,10),(15,18)]
*/

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if (intervals==null || intervals.size()<=1) {
            return intervals;
        }
        
        Collections.sort(intervals, new IntervalComparator());
        List<Interval> result = new ArrayList<Interval>();
        Interval last = intervals.get(0);
        for (int i =1;i<intervals.size();i++) {
            Interval cur = intervals.get(i);
            if (cur.start<= last.end) {
                last.end = Math.max(last.end, cur.end);
            }
            else {
                result.add(last);
                last = cur;
            }
        }
        result.add(last);
        return result;
        
    }
    
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
}