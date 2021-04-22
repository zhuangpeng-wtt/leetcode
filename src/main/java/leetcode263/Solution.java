package leetcode263;

/**
 * 263 丑数
 * 给你一个整数n，请你判断n是否为丑数。如果是，返回true
 * 否则返回false
 *
 * 丑数：就是只包含质因数2、3和/或5的正整数
 * @author zhuangpeng
 */
public class Solution {

    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        if (1 == n) {
            return true;
        }
        if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0 ) {
            return false;
        }
        if (n % 2 == 0) {
            return isUgly(n / 2);
        }
        if (n % 3 == 0) {
            return isUgly(n / 3);
        }
        if (n % 5 == 0) {
            return isUgly(n / 5);
        }
        return false;
    }


    public boolean isUgly2(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};

        for (int factor : factors) {
            while (factor % n == 0) {
                n /= factor;
            }
        }

        return 1 == n;
    }
}
