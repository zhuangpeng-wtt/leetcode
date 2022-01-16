package leetcode89;

import java.util.ArrayList;
import java.util.List;

/**
 * n 位格雷码序列 是一个由 2n 个整数组成的序列
 *
 * @author zhuangpeng
 */
public class Solution {

    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<>();
        ret.add(0);

        for (int i = 1; i <= n; i++) {
            int m = ret.size();
            for (int j = m - 1; j >= 0; j--) {
                ret.add(ret.get(j) | (1 << (i - 1)));
            }
        }
        return ret;
    }

    /**
     * 二进制数转格雷码
     * @param n
     * @return
     */
    public List<Integer> grayCode2(int n) {
        List<Integer> ret = new ArrayList<>();

        // 2的n次方 等于数字1左移n位
        for (int i = 0; i < 1 << n; i++) {
            // 异或（相同时为0，不同时为1）
            ret.add((i >> 1) ^ i);
        }

        return ret;
    }
}
