package leetcode1046;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 1046 最后一块石头的重量
 *
 * 有一堆石头，每块石头的重量都是正整数。
 * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 使用优先队列
     * @param stones
     * @return
     */
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

        for(int i : stones) {
            priorityQueue.offer(i);
        }

        while (priorityQueue.size() > 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            if(a - b > 0) {
                priorityQueue.offer(a - b);
            }
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.peek();
    }
}
