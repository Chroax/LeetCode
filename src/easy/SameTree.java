/*
 * @Link Problem : https://leetcode.com/problems/same-tree
 * @Contributor  : Chroax
 * @Created at   : 15 August 2024, 05:46 PM
 * @Problem      : Given the roots of two binary trees, write a function to check if they are the same
 *                 or not, considered the same if structurally identical and nodes have the same value.
 * @Explanation  : Using recursive approach to ensures that the entire structures and values of both
 *                 trees are compared. The base case is If both p and q are null, the method returns
 *                 true, indicating that both trees are empty at this point and therefore identical.
 *                 If only one of the nodes (p or q) is null, the method returns false, since a null
 *                 node in one tree and a non-null node in the other mean the trees are not
 *                 structurally identical. For non-null nodes, it compares their values. If the values
 *                 match, the method recursively checks the left and right subtrees. If any comparison
 *                 fails, it returns false, indicating that the trees differ either in structure or
 *                 values.
 * */

package easy;

public class SameTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p ==null || q== null) return false;
        if(p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
            return true;
        else
            return false;
    }
}
