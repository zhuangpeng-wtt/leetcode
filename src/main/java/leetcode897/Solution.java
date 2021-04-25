package leetcode897;

import dependency.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuangpeng
 */
public class Solution {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        // 二叉搜索树性质，进行中序遍历即可获得一个升序的序列
        inorder(root, res);

        TreeNode dummyNode = new TreeNode(-1);
        TreeNode currNode = dummyNode;
        for (int value : res) {
            currNode.right = new TreeNode(value);
            currNode = currNode.right;
        }
        return dummyNode.right;
    }


    public void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }


    /**
     * 在中序遍历时直接改变节点的指向
     * @param root
     * @return
     */
    TreeNode currNode;
    public TreeNode increasingBST2(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        currNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    private void inorder(TreeNode node) {
        if (null == node) {
            return;
        }

        // 中序遍历，左根右
        inorder(node.left);

        // 当前遍历的节点
        currNode.right = node;
        node.left = null;
        currNode = node;

        inorder(node.right);
    }
}
