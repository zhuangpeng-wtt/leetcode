package leetcode103;

import dependency.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 103 二叉树的锯齿形层序遍历
 *
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。(即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行)
 * @author zhuangpeng
 */
public class Solution {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();

        if(null == root) {
            return ans;
        }

        //队列
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        //入队列
        nodeQueue.offer(root);
        //初始化遍历从左往右
        boolean isOrderLeft = true;

        while (!nodeQueue.isEmpty()) {
            //双端队列
            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                //从队列头部删除一个元素并返回
                TreeNode curNode = nodeQueue.poll();
                if (isOrderLeft) {
                    //左遍历  从双端队列的末尾插入数据
                    levelList.offerLast(curNode.val);
                } else {
                    //右遍历 从双端队列的头部插入数据
                    levelList.offerFirst(curNode.val);
                }
                if (curNode.left != null) {
                    nodeQueue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    nodeQueue.offer(curNode.right);
                }
            }
            ans.add(new LinkedList<>(levelList));
            //广度优先遍历结束，遍历下一层
            isOrderLeft = !isOrderLeft;
        }
        return ans;
    }
}
