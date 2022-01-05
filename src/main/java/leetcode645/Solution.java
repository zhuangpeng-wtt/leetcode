package leetcode645;

import java.util.*;

/**
 * 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有一个数字重复 。
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。
 * 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/set-mismatch
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author zhuangpeng
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> cacheSet = new HashSet<>();
        Set<Integer> cacheSetA = new HashSet<>();

        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if (cacheSet.contains(nums[i])) {
                // 重复出现的整数
                ans[0] = nums[i];
            }
            else {
                cacheSet.add(nums[i]);
            }
            cacheSetA.add(i + 1);
        }

        for (int item : cacheSetA) {
            if (!cacheSet.contains(item)) {
                ans[1] = item;
            }
        }

        return ans;
    }


    public int[] findErrorNums2(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        int n = nums.length;
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            if (prev == curr) {
                ans[0] = curr;
            }
            else if (curr - prev > 1) {
                // 找到非连续的数字，即丢失的数据
                ans[1] = prev + 1;
            }

            prev = curr;
        }

        // 数组的最后一位不是n ， 丢失的数据就是n
        if (nums[n - 1] != n) {
            ans[1] = n;
        }
        return ans;
    }
}
