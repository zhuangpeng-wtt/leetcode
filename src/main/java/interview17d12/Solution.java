package interview17d12;

/**
 * 面试题17.01 不用加号的加法
 * 与（&）、非（~）、或（|）、异或（^）
 *
 * 异或（^）运算规则：两个数转为二进制，然后从高位开始比较，如果相同则为0，不相同则为1。
 *
 * 设计一个函数把两个数字相加，不能使用 + 或者其他算术运算符
 * 输入：a = 1, b = 1
 * 输出：2
 * @author zhuangpeng
 */
public class Solution {

    /**
     * a^b 表示加数
     * (a & b) << 1 表示进位
     * 当进位位0时，返回加数
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        if (b == 0) {
            return a ^ b;
        }
        return add(a ^ b, (a & b) << 1);
    }
}
