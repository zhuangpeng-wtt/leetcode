package leetcode121;

/**
 * 121. 买卖股票的最佳时机
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 时间复杂度太高
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (prices[i] - prices[j] > ans) {
                    ans = prices[i] - prices[j];
                }
            }
        }

        return ans;
    }

    public int maxProfit2(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            if (p < minPrices) {
                minPrices = p;
            } else if (p - minPrices > maxProfit) {
                maxProfit = p - minPrices;
            }
        }
        return maxProfit;
    }
}
