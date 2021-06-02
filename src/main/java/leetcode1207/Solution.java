package leetcode1207;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuangpeng
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hash = new HashMap<>(8);
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 1) + 1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer val : hash.values()) {
            map.put(val, val);
        }
        return hash.size() == map.size();
    }
}
