package leetcode38;

/**
 * 外观数列
 * 给定一个正整数n，输出外观数列的第n项
 *  1.     1
 *  2.     11
 *  3.     21
 *  4.     1211
 *  5.     111221
 *  6.     312211
 *  7.     13112221
 *  8.     1113213211
 *  9.     31131211131221
 * 10.     13211311123113112211
 * @author zhuangpeng
 */
public class Solution {
    public String countAndSay(int n) {
        String str = "1";

        for(int i = 1; i < n; i++) {
            str = describe(str);
        }
        return str;
    }

    private String describe(String s) {
        StringBuilder res = new StringBuilder();
        if(s.length() == 1){
            res.append('1');
            res.append(s);
            return res.toString();
        }
        int num = 1;
        for(int i = 1; i < s.length(); i++) {
             if(s.charAt(i - 1) != s.charAt(i)) {
                res.append(num);
                res.append(s.charAt(i - 1));
                num = 1;
            } else {
                num++;
            }
        }
        res.append(num);
        res.append(s.charAt(s.length() - 1));
        return res.toString();
    }
}
