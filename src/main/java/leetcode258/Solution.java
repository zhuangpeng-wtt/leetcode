package leetcode258;


/**
 * 258. 各位相加
 * 给定一个非负整数num，反复将各个位上的数字相加，直到结果为一位数
 * 输入：38
 * 输出：2
 * 3 + 8 = 11  1 + 1 = 2
 * @author zhuangpeng
 */
public class Solution {

    public int addDigits(int num) {
        if(num < 10) {
            return num;
        }
        return addDigits(num % 10 + num / 10);
    }

    /**
     * 不使用递归 ，且时间复杂度为O(1)的解法
     * @param num
     * @return
     */
    public int addDigits1(int num) {
        return (num - 1) % 9 + 1;
    }
}
