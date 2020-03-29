/*
Prime factorize a given integer.
*/

public class Solution {
    /**
     * @param num: An integer
     * @return: an integer array
     */
    public List<Integer> primeFactorization(int num) {
        // write your code here
        List<Integer> result = new ArrayList<Integer>();
        for (int i =2;i*i<= num;i++) {
            while (num % i == 0) {
                result.add(i);
                num = num/i;
            }
        }
        if (num!=1) {
        result.add(num);
            
        }
        return result;
        
    }
}