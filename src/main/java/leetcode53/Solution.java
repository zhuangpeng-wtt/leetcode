package leetcode53;

/**
 * @author zhuangpeng
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int ans = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            ans = Math.max(ans, pre);
        }
        return ans;
    }
}
