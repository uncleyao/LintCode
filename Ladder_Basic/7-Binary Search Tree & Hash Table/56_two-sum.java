/*

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are zero-based.

Example
Example1:
numbers=[2, 7, 11, 15], target=9
return [0, 1]
Example2:
numbers=[15, 2, 7, 11], target=9
return [1, 2]
Challenge
Either of the following solutions are acceptable:

O(n) Space, O(nlogn) Time
O(n) Space, O(n) Time

*/

public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    
    class Pair {
        Integer value;
        Integer index;
        
        Pair (Integer value, Integer index){
            this.value = value;
            this.index = index;
        }
        Integer getValue(){
            return this.value;
        }
    }
    
    class ValueComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        Pair[] number = new Pair[numbers.length];
        for (int i=0;i<numbers.length;i++){
            number[i] = new Pair(numbers[i],i);
        }
        Arrays.sort(number, new ValueComparator());
        int L = 0, R = numbers.length-1;
        while (L<R){
           if (number[L].getValue() + number[R].getValue() == target) {

               if (number[L].index<number[R].index){
                   int[] result= {number[L].index, number[R].index};
                   return result;
               }
               else {
                   int [] result = {number[R].index, number[L].index};
                   return result;
               } 
                
            } 
            if (number[L].getValue() + number[R].getValue() < target) {
                L++;
            }
            else {
                R--;
            }
        }
        int[] res ={};
        return res;
            


    }
}