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
    public List<Integer> preorderTraversal(TreeNode root) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	if(root ==null) return list;
	list.add(root.val);
	list.addAll(preorderTraversal(root.left));
	list.addAll(preorderTraversal(root.right));
	return list;
}
}