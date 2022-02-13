package leetcode5;

/**
 * @author zhuangpeng
 */
public class Solution {

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        int begin = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindStr(s, i, j) && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }

    /**
     * 判断子字符串是否时回文字符串
     * @param s
     * @return
     */
    boolean isPalindStr(String s, int left, int right) {
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    /**
     * 动态规划 求解
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        char[] charArray = s.toCharArray();
        int maxLen = 1;
        int begin = 0;
        // 确认dp方程 dp[i][j] 表示s[i...j]是否回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化所有长度为一的字串，长度位一的字串都是回文串
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                }
                else {
                    if (j - i < 3) {
                        // 三个长度包括三个长度以内的字符串肯定是回文串
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }
}
