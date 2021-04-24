package leetcode66;

/**
 * 66.加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @author zhuangpeng
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = ++digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        // 若循环结束后都没退出,代表首位进位了
        digits = new int[length + 1];
        digits[0] = 1;
        return digits;
    }
}
