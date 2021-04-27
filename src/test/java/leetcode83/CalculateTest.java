package leetcode83;

import dependency.ListNode;
import org.junit.Test;

public class CalculateTest {

    @Test
    public void deleteDuplicates() {
        Solution solution = new Solution();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, null)));

        solution.deleteDuplicates(head);
    }
}
