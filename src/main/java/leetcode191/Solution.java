package leetcode191;

/**
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 公式解法
     * 数字一不停左移 与 原数取与操作，结果非0，原数该位上为1，++
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

    /**
     * 我们不断让当前的 n 与 n - 1做与运算，直到 n 变为 0 即可。
     * 6 & (6 - 1) = 4 即 二进制运算 110 & 010 = 100
     * 我们利用这个位运算的性质加速我们的检查过程
     *
     * @param n
     * @return
     */
    public int hammingWeight2(int n) {
        int ret = 0;
        while (n != 0) {
            n = n & (n - 1);
            ret++;
        }
        return ret;
    }
}
