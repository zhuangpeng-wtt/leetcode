package leetcode290;

import java.util.HashMap;
import java.util.Map;

/**
 * 290.单词规律
 * 给定一种规律 pattern 和一个字符串 str，判断 str 是否遵循相同的规律
 *
 * 这里的遵循指完全匹配，例如, pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律
 *
 * 示例1
 * 输入：pattern = "abba", str = "dog cat cat dog"
 * 输出：true
 *
 * 示例2
 * 输入：pattern = "abba", str = "dog cat cat fish"
 * 输出：false
 * @author zhuangpeng
 */
public class Solution {
    /**
     * 解法一
     * @param pattern 模板
     * @param s 单词数组
     * @return 0/1
     */
    boolean wordPattern(String pattern, String s) {
        Map<String, Character> map = new HashMap<>(8);
        char[] patterns = pattern.toCharArray();
        String[] arr = s.split(" ");
        if(patterns.length != arr.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if(map.get(arr[i]) != patterns[i]) {
                    return false;
                }
            } else {
                if(map.containsValue(patterns[i])) {
                    return false;
                } else {
                    map.put(arr[i], patterns[i]);
                }
            }
        }
        return true;
    }

    /**
     * 官方-方法二
     * 双射法
     * pattern = "abba"
     * str = "dog cat cat fish"
     * @param pattern  模板
     * @param str 单词列表
     * @return 0/1
     */
    boolean wordPattern1(String pattern, String str) {
        Map<Character, String> characterStringMap = new HashMap<>(8);
        Map<String, Character> stringCharacterMap = new HashMap<>(8);
        int length = str.length();

        int i = 0;
        int j = 0;
        for(int p = 0; p < pattern.length(); p++) {
            char ch = pattern.charAt(p);
            if(j > length) {
                return false;
            }
            while (j < length && str.charAt(j) != ' ') {
                j++;
            }
            String s = str.substring(i, j);
            if (characterStringMap.containsKey(ch) && !characterStringMap.get(ch).equals(s)) {
                return false;
            }
            if (stringCharacterMap.containsKey(s) && stringCharacterMap.get(s) != ch) {
               return false;
            }

            characterStringMap.put(ch, s);
            stringCharacterMap.put(s, ch);
            i = ++j;
        }
        return i >= length;
    }
}
