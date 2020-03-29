/*
Generate an arrayList with given size, initialize the array list with numbers from 1 to size.
*/

public class Solution {
    /**
     * @param size: An integer
     * @return: An integer list
     */
    public List<Integer> generate(int size) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i =1;i<=size;i++){
            result.add(i);
        }
        return result;
    }
}