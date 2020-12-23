package leetcode714;

/**
 * 714 买卖股票的最佳时机含手续费
 *
 * 给定一个整数数组prices, 其中 i 个元素代表了第 i 天的股票价格；非负整数fee 代表了交易股票的手续费用
 *
 * 你可以无限次的完成交易，但是你每笔交易都需要支付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 *
 * 返回获得利润的最大值。
 *
 * 注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
 *
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 买入并卖出 为一次交易，缴纳一次手续费 fee
     * 输入 prices = [1, 3, 2, 8, 4, 9], fee = 2
     * 输出 8  -1+8-2-4+9-2 = 8
     * @param prices 股期列表
     * @param fee 手续费
     * @return
     */
    int maxProfit(int[] prices, int fee) {
        int putIndex = 0;
        int j = 1;
        int total = 0;


        while (j < prices.length) {
            total = -prices[putIndex];
            if(j == prices.length - 1) {
                total = total + prices[j] - fee;
                return total;
            }

            for(int i = putIndex + 1; i < prices.length; i++) {
                int now = total + prices[i] - fee;
                j = i;
                if (now > 0) {
                    putIndex = i + 1;
                    j = putIndex + 1;
                    total = now;
                    break;
                }
            }
        }
        return total;
    }
}
