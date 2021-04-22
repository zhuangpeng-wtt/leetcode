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
}
