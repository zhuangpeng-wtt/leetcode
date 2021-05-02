package leetcode171;

/**
 * 171. Excel表列序号
 * @author zhuangpeng
 */
public class Solution {

    public int titleToNumber(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }

        return ans;
    }
}
