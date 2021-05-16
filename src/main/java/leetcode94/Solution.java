package leetcode94;

import dependency.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhuangpeng
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        inOrder(root, ans);

        return ans;
    }

    private void inOrder(TreeNode root, List<Integer> ans) {
        if (null == root) {
            return;
        }
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }

    private void bfs(TreeNode root, List<Integer> ans) {
        Deque<TreeNode> stk = new LinkedList<>();
        while (null != root || !stk.isEmpty()) {
            while (null != root) {
                stk.push(root);
                root = root.left;
            }

            root = stk.pop();
            ans.add(root.val);
            root = root.right;
        }
    }
}
