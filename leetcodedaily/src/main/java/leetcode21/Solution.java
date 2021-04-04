package leetcode21;

import dependency.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 21 合并两个有序链表
 *
 * 将两个升序链表合并为一个新的升序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有结点组成的
 * 1->2->4
 * 1->3->4
 * 1->1->2->3->4->4
 *
 * @author zhuangpeng
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode pre = head;
        List<Integer> temp = new ArrayList<>();

        ListNode p = l1;
        while(p != null) {
            temp.add(p.val);
            p = p.next;
        }
        p = l2;
        while(p != null) {
            temp.add(p.val);
            p = p.next;
        }
        Collections.sort(temp);
        for (Integer integer : temp) {
            ListNode newNode = new ListNode(integer);

            pre.next = newNode;
            pre = newNode;
        }
        head = head.next;
        return head;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode();

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
