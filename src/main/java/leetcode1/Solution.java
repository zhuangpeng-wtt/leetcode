package leetcode1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuangpeng
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int f = 0;
        int s;

        for (; f < nums.length - 1; f++) {
            for(s = f + 1; s < nums.length; s++) {
                if (nums[f] + nums[s] == target) {
                    return new int[]{f, s};
                }
            }
        }
        return null;
    }


    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }

        return null;
    }
}
