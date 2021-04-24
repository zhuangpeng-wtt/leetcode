package leetcode104;

import dependency.TreeNode;

/**
 * 二叉树的最大深度
 * @author zhuangpeng
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if(null == root) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
