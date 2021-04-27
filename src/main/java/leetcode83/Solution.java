package leetcode83;

import dependency.ListNode;

/**
 * @author zhuangpeng
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val != curr.next.val) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }
        return head;
    }
}
