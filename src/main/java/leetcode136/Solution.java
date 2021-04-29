package leetcode136;

/**
 * 136. 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 任何数和 00 做异或运算，结果仍然是原来的数
     * 任何数和其自身做异或运算，结果是
     * 异或运算满足交换律和结合律
     * @return
     */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            ans ^= n;
        }

        return ans;
    }
}
