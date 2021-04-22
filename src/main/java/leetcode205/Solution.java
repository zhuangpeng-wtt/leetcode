package leetcode205;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. 同构字符串
 *
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 例子
     * 输入：s = "egg", t = "add"
     * 输出：true
     *
     * 输入：s = “foo”, t = "bar"
     * 输出：false
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> maps = new HashMap<>(8);
        Map<Character, Character> mapt = new HashMap<>(8);

        if(s.length() != t.length()) {
            return false;
        }


        for(int i = 0; i < s.length(); i++) {
            if(maps.containsKey(s.charAt(i)) && maps.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if(mapt.containsKey(t.charAt(i)) && mapt.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
            maps.put(s.charAt(i), t.charAt(i));
            mapt.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }
}
