package leetcode539;

import java.util.Collections;
import java.util.List;

/**
 * 539. 最小时间差
 *
 * @author zhuangpeng
 */
public class Solution {

    public int findMinDifference(List<String> timePoints) {
        // 先排个序，可以使时间差最小的两组数据相邻在一起，或者使它们在首位
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int preMinutes = getMinutes(timePoints.get(0));
        for (int i = 1; i < timePoints.size(); i++) {
            // 比较相邻的两组数据，他们的时间差保留时间差最小的数据
            int currMinutes  = getMinutes(timePoints.get(i));
            ans = Math.min(ans, currMinutes  - preMinutes);
            preMinutes = currMinutes;
        }

        // 比较小首位两组数据的时间差
        ans = Math.min(ans, getMinutes(timePoints.get(0)) + 1440 - preMinutes);

        return ans;
    }


    /**
     * 鸽巢原理
     *
     * @param timePoints
     * @return
     */
    public int findMinDifference2(List<String> timePoints) {

        if (timePoints.size() > 1440) {
            return 0;
        }

        // 先排个序，可以使时间差最小的两组数据相邻在一起，或者使它们在首位
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int preMinutes = getMinutes(timePoints.get(0));
        for (int i = 1; i < timePoints.size(); i++) {
            // 比较相邻的两组数据，他们的时间差保留时间差最小的数据
            int currMinutes  = getMinutes(timePoints.get(i));
            ans = Math.min(ans, currMinutes  - preMinutes);
            preMinutes = currMinutes;
        }

        // 比较小首位两组数据的时间差
        ans = Math.min(ans, getMinutes(timePoints.get(0)) + 1440 - preMinutes);

        return ans;
    }

    public int getMinutes(String t) {
        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
    }
}
