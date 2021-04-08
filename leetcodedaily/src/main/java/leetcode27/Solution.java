package leetcode27;

/**
 * 27移除元素
 * 给你一个数组nums和一个值val，你需要原地移除所有数值等于val的元素
 * 并返回移除后数组的新长度
 * 不需要额外的数组空间，必须使用O(1)额外空间并原地修改输入数组
 * 元素的顺序可以改变
 * @author zhuangpeng
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElemen2(int[] nums, int val) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                 i++;
            }
        }
        return n;
    }
}
