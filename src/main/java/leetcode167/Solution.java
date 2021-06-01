package leetcode167;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和 II - 输入有序数组
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * @author zhuangpeng
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            hash.put(numbers[i], i + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (hash.containsKey(target - numbers[i])) {
                ans[0] = i + 1;
                ans[1] = hash.get(target - numbers[i]);
                break;
            }
        }
        return ans;
    }

    /**
     * 二分查找
     * 遇到有序数组，首先思考能否使用二分查找法提高效率
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            // 固定第一个数,二分查找第二个数
            int low = i + 1;
            int high = numbers.length - 1;
            while (low < high) {
                int mid = (high - low) >> 1 + low;
                if (numbers[i] + numbers[mid] == target) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[i] + numbers[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * 双指针解法
     * i -> 头部
     * j -> 尾部
     * 保持规律 0 <= i < j <= len-1
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum3(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (target == numbers[low] + numbers[high]) {
                return new int[]{low + 1, high + 1};
            } else if(target > numbers[low] + numbers[high]) {
                high--;
            } else {
                low++;
            }
        }
        return new int[]{-1, -1};
    }
}
