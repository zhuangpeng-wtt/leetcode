package twentyDayPractice.day01;

/**
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // 取中间数值，此处不用直接相加除以二，防止int溢出
            int min = (right - left) / 2 + left;
            int num = nums[min];

            if (target == num) {
                return min;
            } else if (num > target) {
                right = min - 1;
            } else {
                left = min + 1;
            }
        }
        return -1;
    }

    /**
     * The isBadVersion API is defined in the parent class VersionControl.
     * boolean isBadVersion(int version);
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        // 推出循环的条件是左右下标记相等，指向同一个元素
        while (left < right) {
            int mid = (right - left) / 2 + left;

            if (isBadVersion(mid)) {
                // 如果当前版本有问题，答案区间可以简单断言在区间【left, mid】
                right = mid;
            } else {
                // 如果当前版本没有问题，答案区间可以简单断言在区间【mid + 1, right】
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }


    /**
     * 在一个有序数组中找第一个大于等于 target 的下标
     *
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {
            int mid = (right - left) >> 2 + left;
            int midVal = nums[mid];

            if (midVal >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
