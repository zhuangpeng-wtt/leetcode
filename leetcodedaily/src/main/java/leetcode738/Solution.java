package leetcode738;

/**
 * 单调递增的数字
 *
 * 给定一个非负整数N，找出小于或等于N的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增
 * （当且仅当每个相邻位数上的数字x和y满足 x<=y 时，我们称这个整数时单调递增的）
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 查出时间限制
     * @param N
     * @return
     */
    public int monotoneIncreasingDigits(int N) {
        while(N >= 10) {
            if(isAddNum(N)) {
                return N;
            }
            --N;
        }
        return N;
    }

    private boolean isAddNum(int n) {
        int t = n;
        while (t != 0) {
            if(t%10 < t/10%10) {
                return false;
            }
            t = t / 10;
        }
        return true;
    }


    /**
     * 方法二
     *
     * 747131058
     * 120 -> 119
     * 1220 -> 1119
     * 332 ->229
     * @param N
     * @return
     */
    public int monotoneIncreasingDigits1(int N) {
        char[] SN = String.valueOf(N).toCharArray();
        int s = 0;
        for (int i = s; i + 1 < SN.length; i++) {
            if(SN[i] > SN[i + 1]) {
                s = i + 1;
                break;
            }
        }
        if(s != 0) {
            //比较前一个是否大于后一个
            while(s > 0 && SN[s-1] > SN[s]) {
                //前一个数字减一
                SN[s - 1] -= 1;
                 s -= 1;
            }
            for(s += 1; s < SN.length; s++) {
                SN[s] = '9';
            }
        }
        return Integer.valueOf(new String(SN));
    }
}
