package leetcode703;

import java.util.PriorityQueue;

/**
 * @author zhuangpeng
 */
public class KthLargest {

    /**
     * 优先队列minHeap 小顶堆
     */
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue();

        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
