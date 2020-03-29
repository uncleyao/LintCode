/*

Given a list of names, remove the duplicate names. Two name will be treated as the same name if they are equal ignore the case.

Return a list of names without duplication, all names should be in lowercase, and keep the order in the original list.

Example
Example 1:

Input:["James", "james", "Bill Gates", "bill Gates", "Hello World", "HELLO WORLD", "Helloworld"]


Output:["james", "bill gates", "hello world", "helloworld"]
*/

public class Solution {
    /**
     * @param names: a string array
     * @return: a string array
     */
    public List<String> nameDeduplication(String[] names) {
        // write your code here
        List<String> results = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i =0;i< names.length;i++){
            String str = names[i].toLowerCase();
            if (!map.containsKey(str)) {
                map.put(str,1);
                results.add(str);
            }
        }
        return results;
    }
}