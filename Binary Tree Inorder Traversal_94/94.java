/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(list == null) return list;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode n = root;
        while(!stack.empty()||n!=null){
            if(n!=null){
                stack.push(n);
                n = n.left;
            }else{
                n = stack.pop();
                list.add(n.val);
                n = n.right;
            }
        }
        return list;
    }
}