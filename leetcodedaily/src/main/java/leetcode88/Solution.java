package leetcode88;

import java.util.Arrays;

/**
 * 88 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2
 * 请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组
 * @author zhuangpeng
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];

            boolean flag = false;
            for (int j = 0; j < m; ++j) {
                if (num <= nums1[j]) {
                    //num 插入当前位置
                    insertNums(nums1, j, num);
                    m++;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                //尾插
                nums1[m] = num;
                m++;
            }
        }
    }

    private void insertNums(int[] nums1, int index, int item) {
        for (int i = nums1.length - 1; i > index ; i--) {
            nums1[i] = nums1[i - 1];
        }
        nums1[index] = item;
    }


    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }

        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }

    /**
     * 最直观 最简单的方法
     * 最直观的方法是先将数组nums2 放进数组nums1的尾部
     * 然后直接对整个数组进行排序
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
