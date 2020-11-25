public class Solution {
    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // write your code here
        /*
        Set<Character> wordDic = new HashSet<>();
        for (char c:s.toCharArray()){
            if (wordDic.contains(c)) wordDic.remove(c);
            else wordDic.add(c);
        }
        int wordRemove = wordDic.size();
        if (wordRemove > 0) return s.length() - wordRemove+1;
        return s.length();
        */
        
        int result = 0, oddPoint = 0;
        HashMap<Character, Integer> wordD = new HashMap<Character, Integer>();
        for (char c: s.toCharArray()){
            if (wordD.containsKey(c)){
                int count = wordD.get(c);
                wordD.put(c,count+1);
            }
            else wordD.put(c,1);
        }
        for (Character k: wordD.keySet()){
            if (wordD.get(k)%2==0) result+=wordD.get(k);
            else {result+=wordD.get(k)-1; oddPoint=1;}
        }
        return result + oddPoint;
        
    }
}
