/* Given number n. Print number from 1 to n. But:

when number is divided by 3, print "fizz".
when number is divided by 5, print "buzz".
when number is divided by both 3 and 5, print "fizz buzz".
when number can't be divided by either 3 or 5, print the number itself.

*/

public class Solution {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> result =new ArrayList<String>(); 
        for (int i = 1;i<n+1;i++){
            if (i%3==0 && i%5==0){
                result.add("fizz buzz") ;
            }
            else if (i%3==0){
                result.add("fizz");
            }
            else if (i%5==0){
                result.add("buzz");
            }
            else {
                result.add(Integer.toString(i)); 
            }
        }
        return result;

    }
}