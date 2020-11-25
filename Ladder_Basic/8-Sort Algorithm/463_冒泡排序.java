/*
Given an integer array, sort it in ascending order. Use selection sort, bubble sort, insertion sort or any O(n2) algorithm
*/

public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here
        // bubble sorting
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < A.length - j ; i++) {
                if (A[i] > A[i+1]) {
                    swap(A, i,i+1);
                    swapped = true;
                }
            } 
        }
    }
    
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

/* 选择排序法 */
public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here
        for (int i= 0; i<A.length;i++) {
            int minIndex = i;
            for (int j =i+1;j<A.length;j++) {
                if (A[j]< A[minIndex]) {
                    minIndex = j;
                }
            }
            swap(A, i, minIndex);
        }
        
    }
    
    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}