package leetcode111;

import dependency.TreeNode;

/**
 * @author zhuangpeng
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(null == root) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
