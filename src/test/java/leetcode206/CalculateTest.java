package leetcode206;

import dependency.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTest {

    @Test
    public void reverseList() {
        Solution solution = new Solution();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;

        printLinkList(first);
        printLinkList(solution.reverseList1(first));
    }


    /**
     * 打印链表的数据 [1,2,3,4,5]
     * @param head
     */
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
