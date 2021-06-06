package leetcode1290;

import dependency.ListNode;

/**
 * 1290. 二进制链表转整数
 * @author zhuangpeng
 */
public class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder v = new StringBuilder();
        while(null != head) {
            v.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(v.toString(), 2);
    }
}
