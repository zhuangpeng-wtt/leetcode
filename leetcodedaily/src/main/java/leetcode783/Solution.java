package leetcode783;

import dependency.TreeNode;

/**
 * 783 二叉搜索树节点最小距离
 * 二叉树的中序遍历是有序的
 * @author zhuangpeng
 */
public class Solution {

    int pre;
    int ans;

    public int minDiffInBST(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        getTreeVal(root);
        return ans;
    }


    public void getTreeVal(TreeNode root) {
        if (root == null) {
            return;
        }
        getTreeVal(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            // 比较当前值和前一个值的差值
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }

        getTreeVal(root.right);
    }
}
