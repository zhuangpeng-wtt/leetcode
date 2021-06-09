package leetcode338;

/**
 * 338. 比特位计数
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i
 * 计算其二进制数中的 1 的数目并将它们作为数组返回。
 * @author zhuangpeng
 */
public class Solution {

    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }

    public int[] countBits2(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int temp = i;
            while (temp != 0) {
                temp = temp & (temp - 1);
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    public int[] countBits3(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i & (i - 1)] + 1;
        }
        return bits;
    }
}
