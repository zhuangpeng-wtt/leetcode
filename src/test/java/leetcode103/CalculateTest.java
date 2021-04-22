package leetcode103;

import dependency.TreeNode;
import org.junit.Test;

public class CalculateTest {

    @Test
    public void zigzagLevelOrder() {
        TreeNode root = new TreeNode(3);

        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        right1.left = left2;
        right1.right = right2;

        Solution solution103 = new Solution();
        System.out.println(solution103.zigzagLevelOrder(root));
    }
}
