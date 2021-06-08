package leetcode226;

import dependency.TreeNode;

/**
 * 226. 翻转二叉树
 *
 * @author zhuangpeng
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
