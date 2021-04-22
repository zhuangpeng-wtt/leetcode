package leetcode14;

/**
 * 14-最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀
 * 如果不存在公共前缀，返回空字符串""
 * 输入：strs = ["flower", "flow", "flight"]
 * 输出："fl"
 * @author zhuangpeng
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }

        StringBuilder ans = new StringBuilder();
        int minLen = 0;
        while(true) {
            for(int i = 0; i < strs.length-1; i++) {
                if(strs[i].length() <= minLen || strs[i + 1].length() <= minLen) {
                    return ans.toString();
                }
                if(strs[i].charAt(minLen) != strs[i + 1].charAt(minLen)) {
                    return ans.toString();
                }
            }
            ans.append(strs[0].charAt(minLen));
            minLen++;
        }
    }

    /**
     * 方法一
     * 横向扫描
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs) {
        if(null == strs || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);

            //如果公共前缀已经是空串了，则最长公共前缀一定是空串，此时跳出循环不需要再遍历了
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    /**
     * 依次遍历字符串数组中的每个字符串，对于每个遍历到的字符串，更新最长公共前缀
     * 当遍历完所有的字符串以后，即可得到字符串数组中的最长公共前缀
     * @param str1
     * @param str2
     * @return
     */
    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }

}
