package leetcode783;

import dependency.TreeNode;
import org.junit.Test;

public class CalculateTest {

    @Test
    public void minDiffInBST() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4);

        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(6);
        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(3);
        right1.left = left2;
        right1.right = right2;

        System.out.println(solution.minDiffInBST(root));
    }
}
