package leetcode145;

import dependency.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhuangpeng
 */
public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        bfs(root, ans);

        return ans;
    }

    private void bfs(TreeNode root, List<Integer> ans) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        while (null != root || !stack.isEmpty()) {
            while(null != root) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (null == root.right || root.right == prev) {
                ans.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
    }

    private void postOrder(TreeNode root, List<Integer> ans) {
        if (null == root) {
            return;
        }
        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }


}
