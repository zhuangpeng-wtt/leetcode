package leetcode382;

import dependency.ListNode;

import java.util.Random;

/**
 * @author zhuangpeng
 */
public class Solution {

    private ListNode node;
    private Random random;

    public Solution(ListNode head) {
        this.node = head;
        random = new Random();
    }

    public int getRandom() {
        int ans = 0, i = 1;
        for (ListNode curr = node; curr != null; curr = curr.next) {
            if (random.nextInt(i) == 0) {
                ans = curr.val;
            }
            i++;
        }
        return ans;
    }
}
