package leetcode144;

import dependency.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * leeCode 144 二叉树的前序遍历
 * @author zhuangpeng
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        bfs(root, ans);

        return ans;
    }

    /**
     * 迭代 - 广度优先
     * @param root
     * @param ans
     */
    private void bfs(TreeNode root, List<Integer> ans) {
        if (null == root) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode currNode = root;

        while (!stack.isEmpty() || currNode != null) {
            while (currNode != null) {
                ans.add(currNode.val);
                stack.push(currNode);
                currNode = currNode.left;
            }
            currNode = stack.pop();
            currNode = currNode.right;
        }
    }

    /**
     * 递归 - 深度优先
     * @param root
     * @param ans
     */
    private void dfs(TreeNode root, List<Integer> ans) {
        if (null == root) {
            return;
        }
        dfs(root.left, ans);
        dfs(root.right, ans);
        ans.add(root.val);
    }
}
