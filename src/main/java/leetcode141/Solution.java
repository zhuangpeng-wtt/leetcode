package leetcode141;

import dependency.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuangpeng
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> hashTable = new HashMap<>();

        int i = 0;
        ListNode curr = head;

        while (null != curr) {
            if (hashTable.containsKey(curr)) {
                return true;
            }
            hashTable.put(curr, ++i);
            curr = curr.next;
        }
        return false;
    }

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != slow) {
            if (null == fast || null == fast.next) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
