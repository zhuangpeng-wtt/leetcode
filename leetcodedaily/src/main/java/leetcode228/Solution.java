package leetcode228;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. 汇总区间
 *
 * 给定一个无重复元素的有序整数数组 nums 。
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 * @author zhuangpeng
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rangesAnswer = new ArrayList<>();
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuilder temp = new StringBuilder(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->");
                temp.append(nums[high]);
            }
            rangesAnswer.add(temp.toString());
        }
        return rangesAnswer;
    }
}
