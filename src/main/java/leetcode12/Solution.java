package leetcode12;

/**
 * 12. 整数转罗马数字
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 在代码中实现它最简单的方法是使用 4 个独立的数组；每个位置值对应一个数组。然后，在输入数字中提取每个位置的数字
     * 在相关数组中查找它们的符号，并将它们全部附加在一起
     *
     * @return
     */
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] + hundreds[num % 1000 / 100] + tens[num % 100 / 10] + ones[num % 10];
    }
}
