package leetcode1629;

/**
 * @author zhuangpeng
 */
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] chars = keysPressed.toCharArray();
        char ans = chars[0];
        int f = releaseTimes[0];

        for (int i = 1; i < chars.length; i++) {
            if ((releaseTimes[i] - releaseTimes[i - 1]) > f) {
                ans = chars[i];

                f = releaseTimes[i] - releaseTimes[i - 1];
            }
            else if ((releaseTimes[i] - releaseTimes[i - 1]) == f) {
                if (ans < chars[i]) {
                    ans = chars[i];

                    f = releaseTimes[i] - releaseTimes[i - 1];
                }
            }
        }
        return ans;
    }
}
