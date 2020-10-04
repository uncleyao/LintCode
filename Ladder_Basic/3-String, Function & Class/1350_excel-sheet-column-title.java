/*
* Input: 29
* Output: "AC"
* Notice
* 1 -> A
* 2 -> B
* 3 -> C
* ...
* 26 -> Z
* 27 -> AA
*/

public class Solution {

    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        
        while (n>0) {
            n--;
            str.append((char)((n%26)+'A') );
            n=n/26;
        }
        return str.reverse().toString();
    }
}
