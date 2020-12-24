package leetcode387;

import java.util.HashMap;
import java.util.Map;

/**
 * 387 字符串中的第一个唯一字符
 *
 * 给定一个字符串，找到它的一个不重复的字符，并返回它的索引。如果不存在，则返回-1
 * @author zhuangpeng
 */
public class Solution {

    int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(8);

        if(s.length() == 1) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        //Map中的数据是无序的
        for (int i = 0; i < s.length(); ++i) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 解法二
     *
     * 遍历字母数时，可以使用Map的默认函数设置初始值
     * getOrDefault
     * @param s
     * @return
     */
    int firstUniqChar2(String str) {
        Map<Character, Integer> firstUniqChar = new HashMap<>(8);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //getOrDefault(key, v) 当不存在这个key时 默认设置v这个值
            firstUniqChar.put(ch, firstUniqChar.getOrDefault(ch, 0) + 1);
        }

        //Map中的数据是无序的
        for (int i = 0; i < str.length(); ++i) {
            if (firstUniqChar.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
