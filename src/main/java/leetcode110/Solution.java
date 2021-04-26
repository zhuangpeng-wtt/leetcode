package leetcode110;

import dependency.TreeNode;

/**
 * 110. 平衡二叉树
 *
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1
 * @author zhuangpeng
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }

        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int dfs(TreeNode node) {
        if (null == node) {
            return 0;
        }
        return Math.max(dfs(node.left), dfs(node.right)) + 1;
    }

}
