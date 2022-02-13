package leetcode389;

/**
 * 389 找不同
 *
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 * @author zhuangpeng
 */
public class Solution {

    public char findTheDifference(String s, String t) {
        int ret = 0;

        for (int i = 0; i < t.length(); i++) {
            ret += t.charAt(i);
        }
        for (int j = 0; j < s.length(); j++) {
            ret -= s.charAt(j);
        }

        return (char) ret;
    }

    /**
     * 位运算
     * 用异或
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference2(String s, String t) {
        int ans = 0;
        String str = s + t;
        for (int i = 0; i < str.length(); i++) {
            ans ^= str.charAt(i);
        }
        return (char) ans;
    }
}
