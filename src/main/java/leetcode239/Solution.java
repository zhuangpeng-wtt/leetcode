package leetcode239;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author zhuangpeng
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[0] != o2[1] ? o2[0] - o1[0] : o2[1] - o1[1]);

        // 先将前k个数放入队列中
        for (int i = 0; i < k; i++) {
            pq.add(new int[]{nums[i], i});
        }

        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];

        // 将后续的数据放到队列中
        for (int i = k; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});

            // 比较下标，找出优先队列栈顶的数据是否已经不在窗口中了，不在窗口中的要删掉
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }
}
