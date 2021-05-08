package leetcode1;

/**
 * @author zhuangpeng
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int f = 0;
        int s;

        for (; f < nums.length - 1; f++) {
            for(s = f + 1; s < nums.length; s++) {
                if (nums[f] + nums[s] == target) {
                    return new int[]{f, s};
                }
            }
        }
        return null;
    }
}
