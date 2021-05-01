package leetcode169;

import java.util.Arrays;

/**
 * @author zhuangpeng
 */
public class Solution {
    /**
     * 由于众数得个数是大于n/2的特性
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * Boyer-Moore 投票算法
     * 如果我们把众数记为 +1+1，把其他数记为 -1−1，将它们全部加起来，显然和大于 0，从结果本身我们可以看出众数比其他数多
     * 摩尔投票法，遇到相同的数，就投一票，遇到不同的数，就减一票，最后还存在票的数就是众数
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int n : nums) {
            if (0 == count) {
                candidate = n;
            }
            count += candidate == n ? 1 : -1;
        }
        return candidate;
    }
}
