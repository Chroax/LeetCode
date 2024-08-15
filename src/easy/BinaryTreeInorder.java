/*
 * @Link Problem : https://leetcode.com/problems/binary-tree-inorder-traversal
 * @Contributor  : Chroax
 * @Created at   : 15 August 2024, 05:15 PM
 * @Problem      : Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *                 Do it iteratively.
 * @Explanation  : We will use stack to navigate the tree node. First traverse to the leftmost node.
 *                 If leaf node already reached, pop the top node and add it to the list. Then move to
 *                 the right node. This process repeats until all nodes have been visited in in-order,
 *                 at which point the traversal list, contains the nodes in the correct order
 * */
package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode iterate = root;
        traversal.add(iterate.val);
        while (iterate != null || !stack.isEmpty()) {
            while (iterate != null) {
                stack.push(iterate);
                iterate = iterate.left;
            }
            iterate = stack.pop();
            traversal.add(iterate.val);
            iterate = iterate.right;
        }

        return traversal;
    }
}
