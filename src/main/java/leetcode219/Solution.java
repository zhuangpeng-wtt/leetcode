package leetcode219;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 219. 存在重复元素 II
 *
 * @author zhuangpeng
 */
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> tempVal = new HashMap<>(8);

        tempVal.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (tempVal.containsKey(nums[i])) {
                if (Math.abs(i - tempVal.get(nums[i])) <= k) {
                    return true;
                }
            }

            tempVal.put(nums[i], i);
        }
        return false;
    }

    /**
     * 使用滑动窗口的方法
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                // 删除头一个数
                set.remove(nums[i - k - 1]);
            }
            else if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
