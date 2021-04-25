package leetcode70;

/**
 * 70. 爬楼梯
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * @author zhuangpeng
 */
public class Solution {

    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climbStairsMemo(n, memo);
    }

    private int climbStairsMemo(int n, int[] memo) {
        if (memo[n] > 0) {
            return memo[n];
        }

        if (n == 1) {
            // 数组赋值会返回被赋值的结果
            return memo[n] = 1;
        } else if (n == 2) {
            return memo[n] = 2;
        } else {
            memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
        }
        return memo[n];
    }

    public int climbStairs2(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
