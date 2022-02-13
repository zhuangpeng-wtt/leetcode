package leetcode24;

import dependency.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTest {

    @Test
    public void test() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode three = new ListNode(3);

        first.next = second;
        second.next = three;

        ListNode first1 = new ListNode(1);
        ListNode second1 = new ListNode(2);
        ListNode three1 = new ListNode(3);

        first1.next = second1;
        second1.next = three1;

        Solution solution = new Solution();
        printLinkList(solution.swapPairs(first));
    }



    public void printLinkList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }
        System.out.println(list);
    }
}
