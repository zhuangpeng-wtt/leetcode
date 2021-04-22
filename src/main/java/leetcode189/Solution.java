package leetcode189;

/**
 * 189 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 公式解题法
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] newArray = new int[length];

        //变量老数组 i 位置的元素，在新数组(i + k)%老数组长度
        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % length] = nums[i];
        }

        System.arraycopy(newArray, 0, nums, 0, length);
    }


    /**
     * 反转数组法
     * 1.反转整个数组
     * 2.反转区间0 ~ k mod n - 1的数组
     * 3.反转区间k mod n ~ n -1的数组
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
