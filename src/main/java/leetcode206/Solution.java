package leetcode206;

import dependency.ListNode;

/**
 * 反转一个单链表
 * 输入：1->2->3->4->5->null
 * 输出：5->4->3->2->1->null
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 遍历链表 第一步都要声明一个前置变量 ListNode current
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        return pre;
    }

    /**
     * 方法二使用递归的方式
     * 1->2->3->4->5->null
     *
     * 1.head -> 5  p -> 5   return p
     * 2.head -> 4  5->4->null  p->5->4->null return p
     * 3.head -> 3  4->3->null  p->5->4->3->null return p
     * 4.head -> 2  3->2->null  p->5->4->3->2->null return p
     * 5.head -> 1  2->1->null  p->5->4->3->2->1->null return p
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //最后一次递归 p 指向的是末节点
        ListNode p = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
