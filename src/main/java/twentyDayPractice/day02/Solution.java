package twentyDayPractice.day02;

import java.util.Arrays;

/**
 * @author zhuangpeng
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }

        Arrays.sort(ans);
        return ans;
    }

    public int[] sortedSquares1(int[] nums) {
        int[] ans = new int[nums.length];
        int pops = nums.length - 1;

        for (int i = 0, j = nums.length - 1; i <= j;) {
            if (nums[i]*nums[i] < nums[j]*nums[j]) {
                ans[pops] = nums[j]*nums[j];
                j--;
            } else {
                ans[pops] = nums[i]*nums[i];
                i++;
            }
            pops--;
        }
        return ans;
    }


    public void rotate(int[] nums, int k) {
        // 1.反转整个数组
        reverse(nums, 0, nums.length - 1);
        // 2.反转 【0, k % len - 1】区间的数组
        reverse(nums,0 , 3 % nums.length - 1);
        // 3.反转剩余区间的数组
        reverse(nums, 3 % 7, nums.length - 1);
    }

    /**
     * 反转数组
     * @param nums
     * @param start
     * @param end
     */
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

}
