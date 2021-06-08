package leetcode1588;

import java.util.LinkedList;

/**
 * 1588. 所有奇数长度子数组的和
 *
 * 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
 * 子数组 定义为原数组中的一个连续子序列。
 * 请你返回 arr 中 所有奇数长度子数组的和 。
 * @author zhuangpeng
 */
public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        LinkedList<Integer> presum = new LinkedList<>();
        presum.add(0);
        for (int val : arr) {
            Integer last = presum.peekLast();
            presum.add((last==null?0:last) + val);
        }

        for(int i = 0; i < arr.length; i ++) {
            for(int sz = 1; i + sz <= arr.length; sz += 2) {
                sum += presum.get(i+sz) - presum.get(i);
            }
        }
        return sum;
    }
}
