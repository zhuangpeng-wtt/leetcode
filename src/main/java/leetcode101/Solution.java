package leetcode101;

import dependency.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 * @author zhuangpeng
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode root, TreeNode root1) {
        if (null == root && null == root1) {
            return true;
        }
        if (null == root || null == root1) {
            return false;
        }
        return root.val == root1.val && check(root.right, root.left) && check(root1.right, root1.left);
    }


    public boolean isSymmetric2(TreeNode root) {
        return check2(root, root);
    }

    private boolean check2(TreeNode root, TreeNode root1) {
        Queue<TreeNode> q = new LinkedList<>();
        // 将根节点推出队列两次
        q.offer(root);
        q.offer(root1);

        while(!q.isEmpty()) {
            root = q.poll();
            root1 = q.poll();
            if (null == root && null == root1) {
                continue;
            }
            if (null == root || null == root1) {
                return false;
            }
            if (root.val != root1.val) {
                return false;
            }

            // 镜像压入
            q.offer(root.left);
            q.offer(root1.right);

            q.offer(root.right);
            q.offer(root1.left);
        }
        return true;
    }
}
