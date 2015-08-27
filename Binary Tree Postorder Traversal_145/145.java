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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        TreeNode n = root;
        while(!stack.empty()||n!=null){
            if(n!=null){
                stack.push(n);
                n=n.left;
            }else{
                TreeNode peek = stack.peek();
                if(peek.right!=null && pre!=peek.right){
                    n=peek.right;
                }else{
                    stack.pop();
                    list.add(peek.val);
                    pre = peek;
                }
            }
        }
        return list;
    }
}