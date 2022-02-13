package base.day01;

/**
 * @author zhuangpeng
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = ((right - left) >> 2) + left;
            if (nums[mid] == target) {
                ans[0] = mid;
                ans[1] = mid;
            } else if (nums[mid] > target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
