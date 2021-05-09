package leetcode160;

import dependency.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuangpeng
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> hashTable = new HashMap<>();

        while (null != headB) {
            hashTable.put(headB, headB.val);
            headB = headB.next;
        }
        while (null != headA) {
            if (hashTable.containsKey(headA)) {
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode curr1 = headA;
        ListNode curr2 = headB;
        while (curr1 != curr2) {
            if (null != curr1) {
                curr1 = curr1.next;
            }
            else {
                curr1 = headB;
            }

            if (null != curr2) {
                curr2 = curr2.next;
            }
            else {
                curr2 = headA;
            }
        }

        return curr1;
    }
}
