package interview17d16;

/**
 * @author zhuangpeng
 */
public class Solution {
    public int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int dp0 = 0, dp1 = nums[0];

        for (int i = 1; i < n; ++i){
            // 第i个预约不接的最长预约时间
            int tdp0 = Math.max(dp0, dp1);
            // 第i个预约接的最长预约时间
            int tdp1 = dp0 + nums[i];

            dp0 = tdp0;
            dp1 = tdp1;
        }
        return Math.max(dp0, dp1);
    }
}
