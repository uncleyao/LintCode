/*
从上往下打印出二叉树的每个节点，同层节点从左至右打印。

*/
/*
思路：
利用队列：先加root
每次拿出queue的第一个node然后把left, right 加到queue的最后
再保存这个node的val到result里

*/


import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root==null){
            return result;
        }
        queue.add(root);
        while (queue.size()!=0){
            TreeNode temp = queue.remove(0);
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
            result.add(temp.val);
        }
        return result;
    }
}