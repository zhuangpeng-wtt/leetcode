package twentyDayPractice.day05;

import dependency.ListNode;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int i = 0;
        while (null != head) {
            A[i++] = head;
            head = head.next;
        }

        return A[i / 2];
    }


    public ListNode middleNode1(ListNode head) {
        int i = 0;
        ListNode curr = head;

        while (null != curr) {
            i++;
            curr = curr.next;
        }

        curr = head;
        int k = 0;
        while (k < i / 2) {
            curr = curr.next;
            k++;
        }
        return curr;
    }

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack  = new LinkedList<>();
        ListNode curr = dummy;

        while (null != curr) {
            stack.push(curr);
            curr = curr.next;
        }

        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev  = stack.peek();
        prev .next = prev.next.next;

        return dummy.next;
    }
}
