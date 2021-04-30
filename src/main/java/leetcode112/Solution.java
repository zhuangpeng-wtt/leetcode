package leetcode112;

import dependency.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 112. 路径总和
 * @author zhuangpeng
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (null == root) {
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(root.val);

        while (!queNode.isEmpty()) {
            TreeNode now = queNode.poll();
            int temp = queVal.poll();
            if (null == now.left && null == now.right) {
                if(temp == targetSum){
                    return true;
                }
                continue;
            }
            if (null != now.left) {
                queNode.offer(now.left);
                queVal.offer(now.left.val + temp);
            }
            if (null != now.right) {
                queNode.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }

    /**
     * dfs
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum2(TreeNode root, int targetSum) {
        int temp = 0;
        if (null == root) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return temp + root.val == targetSum;
        }
        return hasPathSum2(root.right, temp + root.val) || hasPathSum2(root.left, temp + root.val);
    }
}
