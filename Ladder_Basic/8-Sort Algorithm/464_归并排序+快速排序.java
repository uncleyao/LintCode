public class SolutionMerge {

    public void sortIntegers2(int[] A) {
        // write your code here
        // 归并排序
        /**
        * 将数组分两份，每一份做递归排序，再merge起来
        * 提前申请一个临时表
        *
        */
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
        int i = left, j = mid+1; // 左边指针和中间指针
        // 
        for (int k =0;k < right-left+1;k++) {
            if (i<=mid && (j>right || A[i] < A[j])) {
                temp[k] = A[i++];
            }
            else {
                temp[k] = A[j++];
            }
        }
        // 临时结果返回给 A
        for (int k =0;k<right-left+1;k++) {
            A[left+k] = temp[k];
        }
        
    }
}

/* 快速排序*/
public class SolutionQuick {
    public void sortIntegers2(int[] A) {
        // write your code here
        quickSort(A, 0, A.length-1);
        
    }
    
    /*
    选出一个基准pivot
    重新排序数列，比基准值小的在左边，大的在右边
    然后递归

    */
    private void quickSort(int[] A, int start, int end) {
        if (start >=end) {
            return;
        }
        int i = start;
        int j = end;
        int pivot = A[start + (end-start)/2];
        while (i <= j){
            while (i<=j && A[i] < pivot) {
                i++;
            }
            while (i<=j && A[j]> pivot) {
                j--;
            }
            if (i<=j) {
            swap(A, i++,j--);
            }
        }
        quickSort(A, start, j);
        quickSort(A, i, end);
        }
    
    
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}