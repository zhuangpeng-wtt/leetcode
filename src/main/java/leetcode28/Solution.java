package leetcode28;

/**
 * 实现 strStr()
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）
 * 如果不存在，则返回  -1
 *
 * @author zhuangpeng
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        if("".equals(haystack) && "".equals(needle)) {
            return 0;
        }
        if(!"".equals(haystack) && "".equals(needle)) {
            return 0;
        }
        if("".equals(haystack) || "".equals(needle)) {
            return -1;
        }


        int startIndex = -1;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (isSame(haystack, needle, i)) {
                startIndex = i;
                break;
            }
        }
        return startIndex;
    }

    boolean isSame(String haystack, String needle, int startIndex) {
        for (int j = 0,m=startIndex; j < needle.length(); j++,m++) {
            if(haystack.charAt(m) != needle.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public int strStr2(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i - m <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                return i;
            }
        }

        return -1;
    }
}
