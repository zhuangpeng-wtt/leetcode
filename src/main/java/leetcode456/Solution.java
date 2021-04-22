package leetcode456;

import java.util.TreeMap;

/**
 * @author zhuangpeng
 */
public class Solution {

    /**
     * [1, 2, 3, 4] -> false
     * [3, 1, 4, 2] -> true   [1, 4, 2]
     *
     * 查询数组内 132 模式的子序列
     * nums[i] < nums[k] < nums[j]
     * i<k<j
     * @param nums
     * @return
     */
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }

        //左侧最小值
        int leftMin = nums[0];
        //右侧所有元素
        TreeMap<Integer, Integer> rightAll = new TreeMap<>();

        for (int k = 2; k < n; k ++) {
            rightAll.put(nums[k], rightAll.getOrDefault(nums[k], 0) + 1);
        }

        for (int j = 1; j < n -1; j++) {
            if (leftMin < nums[j]) {
                //返回大于或等于 （给定值） 的元素
                Integer next = rightAll.ceilingKey(leftMin + 1);
                if (next != null && next < nums[j]) {
                    return true;
                }
            }

            //重新指定左侧最小的数
            leftMin = Math.min(leftMin, nums[j]);

            //从平衡树里去除中间数
            rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
            if (rightAll.get(nums[j + 1]) == 0) {
                rightAll.remove(nums[j + 1]);
            }
        }
        return false;
    }
}
