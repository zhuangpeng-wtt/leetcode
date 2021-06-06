package leetcode461;

/**
 * 461. 汉明距离
 * @author zhuangpeng
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance1(int x, int y) {
        int ans = 0;
        int v = x ^ y;
        while (v != 0) {
            ans += v & 1;
            v = v >> 1;
        }
        return ans;
    }
}
