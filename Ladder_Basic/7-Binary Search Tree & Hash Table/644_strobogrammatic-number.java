/*
A mirror number is a number that looks the same when rotated 180 degrees (looked at upside down).For example, the numbers "69", "88", and "818" are all mirror numbers.
*/

public class Solution {
    /**
     * @param num: a string
     * @return: true if a number is strobogrammatic or false
     */
    public boolean isStrobogrammatic(String num) {
        // write your code here
        if (num=="") {
            return true;
        }
        int len = num.length();
        if (len==1){
            return num.equals("1") ||num.equals("0")|| num.equals("8");
        }
        if (len==2){
            return (num.charAt(0)=='1' && num.charAt(len-1)=='1') || (num.charAt(0)=='6' && num.charAt(len-1)=='9') || (num.charAt(0)=='9' && num.charAt(len-1)=='6') || (num.charAt(0)=='8' && num.charAt(len-1)=='8');
        }

        return ((num.charAt(0)=='0' && num.charAt(len-1)=='0') ||(num.charAt(0)=='1' && num.charAt(len-1)=='1') || (num.charAt(0)=='6' && num.charAt(len-1)=='9') || (num.charAt(0)=='9' && num.charAt(len-1)=='6') || (num.charAt(0)=='8' && num.charAt(len-1)=='8')) && isStrobogrammatic(num.substring(1, len-1));
    }
}