/*
Given an integer array, sort it in ascending order in place. Use quick sort, merge sort, heap sort or any O(nlogn) algorithm.
*/

public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers2(int[] A) {
        // write your code here
        // merge sort
        int[] temp = new int[A.length];
        mergeSortHelper(A, 0, A.length-1, temp);
    }
    
    private void mergeSortHelper(int[] A, int left, int right, int[] temp) {
        if (left>=right) {
            return;
        }
        int mid = left + (right - left)/2;
        mergeSortHelper(A, left, mid, temp);
        mergeSortHelper(A, mid+1, right, temp);
        merge(A, left, right,temp);
        
        
    }
    
    private void merge(int[] A, int left, int right, int[] temp){
        int mid = left+ (right - left)/2;
        int i = left, j = mid+1;
        for (int k =0;k < right-left+1;k++) {
            if (i<=mid && (j>right || A[i] < A[j])) {
                temp[k] = A[i++];
            }
            else {
                temp[k] = A[j++];
            }
        }
        for (int k =0;k<right-left+1;k++) {
            A[left+k] = temp[k];
        }
        
    }
}