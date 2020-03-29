/*
Given an array of n objects with k different colors (numbered from 1 to k), sort them so that objects of the same color are adjacent, with the colors in the order 1, 2, ... k.

Example
Example1

Input: 
[3,2,2,1,4] 
4
Output: 
[1,2,2,3,4]
Example2

Input: 
[2,1,1,2,2] 
2
Output: 
[1,1,2,2,2]
Challenge
A rather straight forward solution is a two-pass algorithm using counting sort. That will cost O(k) extra memory. Can you do it without using extra memory?

*/

public class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        sortColorHelper(colors, 0, colors.length-1, 1,k);
    }
    
    private void sortColorHelper(int[] colors, int left, int right, int colorfrom, int colorto) {
        if (colorto==colorfrom) {  // not colorto >=colorfrom
            return;
        }
        if (left>=right) {
            return;
        }
        int i = left, j= right;
        int pivot = (colorfrom + colorto)/2;
        while (i<=j) {
            while (i<=j && colors[i]<= pivot) {  // be careful this is <=
                i++;
            }
            while (i<=j && colors[j]>pivot) {
                j--;
            }
            if (i<=j) {
                swap(colors, i++,j--);
            }
        }
        sortColorHelper(colors,left,j,colorfrom, pivot);
        sortColorHelper(colors,i,right,pivot+1,colorto);
        
        
    }
    
    private void swap(int[] colors, int i, int j) {
        int temp = colors[i];
        colors[i] = colors[j];
        colors[j] = temp;
    }
}