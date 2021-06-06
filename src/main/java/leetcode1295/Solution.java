package leetcode1295;

/**
 * 1295. 统计位数为偶数的数字
 * @author zhuangpeng
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if ((log(num, 10) + 1)%2 == 0) {
                ans++;
            }
        }
        return ans;
    }


    /**
     * 根据换底公式使用java Math.log Aip 求对数公式 -- 存在精度问题
     * @param basement 底数
     * @param n 值
     * @return
     */
    public static int log(int n, int basement){
        return (int) (Math.log(n) / Math.log(basement));
    }

    public static void main(String[] args) {
        System.out.println(((int) (Math.log(1000) / Math.log(10)) + 1)%2);
    }
}
