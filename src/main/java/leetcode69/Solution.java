package leetcode69;

/**
 * 69. x 的平方根
 *
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 袖珍计算器
     *
     * 指数函数和对数函数的参数和返回值均为浮点数，因此运算过程中会存在误差。
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if (0 == x) {
            return 0;
        }

        int ans = (int) Math.exp(Math.log(x) / 2);
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }

    /**
     * 二分查找发
     * @param x
     * @return
     */
    public int mySqrt2(int x) {
        if (0 == x) {
            return 0;
        }

        int left = 0;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) >> 1;
            if ((long) mid * mid <= x) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
