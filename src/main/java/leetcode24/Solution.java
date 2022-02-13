package leetcode24;

import dependency.ListNode;

/**
 * @author zhuangpeng
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode();
        ans.next = head;
        ListNode temp = ans;

        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;

            // 开始交换
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }

        return ans.next;
    }
}
