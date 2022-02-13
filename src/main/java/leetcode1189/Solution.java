package leetcode1189;

import java.util.Arrays;

/**
 * balloon
 * @author zhuangpeng
 */
public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] split = new int[5];

        for (int i = 0; i < text.length(); i++) {
            if ('b' == text.charAt(i)) {
                split[0]++;
            } else if ('a' == text.charAt(i)) {
                split[1]++;
            } else if ('l' == text.charAt(i)) {
                split[2]++;
            } else if ('o' == text.charAt(i)) {
                split[3]++;
            } else if ('n' == text.charAt(i)) {
                split[4]++;
            }
        }
        split[2] = split[2] / 2;
        split[3] = split[3] / 2;

        return Arrays.stream(split).min().getAsInt();
    }
}
