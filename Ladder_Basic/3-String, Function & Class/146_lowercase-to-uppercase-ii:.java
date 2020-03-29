/*
Implement an upper method to convert all characters in a string to uppercase.

The characters not in alphabet don't need to convert.
*/

public class Solution {
    /**
     * @param str: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String str) {
        // write your code here
        int len = str.length();
        String result = "";
        for (int i=0;i<len;i++){
            if (str.charAt(i)>='a' && str.charAt(i)<='z' ) {
                result = result+ (char) (str.charAt(i)-'a'+'A');
                
            }
            else {
                result = result + str.charAt(i);
            }
        }
        return result;
        
    }
}