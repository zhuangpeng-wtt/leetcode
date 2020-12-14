package leetcode49;

import java.util.*;

/**
 * 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例：
 * 输入：["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出：[["ate","eat","tea"], ["nat","tan"], ["bat"]]
 * @author zhuangpeng
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<String, List<String>>(8);
        for (String str : strs) {
            String sort = sortStr(str);

            if (!map.containsKey(sort)) {
                List<String> group = new ArrayList<String>();
                group.add(str);
                map.put(sort, group);
            } else {
                map.get(sort).add(str);
            }
        }

        return new ArrayList<List<String>>(map.values());
    }

    /**
     * 字符串排序
     * @param str
     * @return
     */
    private String sortStr(String str) {
        char[] arrayCh = str.toCharArray();
        Arrays.sort(arrayCh);
        return new String(arrayCh);
    }


    /**
     * 解法二，使用的了Map 函数里的 getOrDefault()方法
     * 当Map集合中有这个key时，就使用这个key值，如果没有就使用默认值defaultValue
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            //当Map集合中有这个key时，就使用这个key值，如果没有就使用默认值defaultValue
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

}
