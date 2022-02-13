package twentyDayPractice.day03;

/**
 * @author zhuangpeng
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            // 二分查找第二个数
            int left = i + 1;
            int right = size - 1;

            while(left <= right) {
                int mid = ((right - left) >> 1) + left;

                if (numbers[i] + numbers[mid] == target) {
                    return new int[]{i, mid};
                } else if (numbers[i] + numbers[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return new int[]{-1, -1};
    }

    /**
     * 双指针
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum2(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;

        while (head < tail) {
            int total = numbers[head] + numbers[tail];
            if (total == target) {
                return new int[]{head + 1, tail + 1};
            } else if (total > target) {
                tail--;
            } else {
                head++;
            }
        }

        return new int[]{-1, -1};
    }


    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;

        while (i < nums.length) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                i++;
            } else {
                j++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
