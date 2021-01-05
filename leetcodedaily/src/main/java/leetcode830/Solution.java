package leetcode830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 830 较大分组的位置
 * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组
 * 例如，在字符串 s = "abbxxxxxzyy" 中，就包含有 "a" ,"bb", "xxxxx", "z", "yy"这样的一些分组。
 * 分组就可以用区间[start, end]表示，其中start和end分别表示该分组的起始和终止位置的下标，上例中
 * 的"xxxxx"分组用区间表示未[3, 6]
 * 我们称所有包含大于或等于三个连续字符的分组为较大分组
 * 找到每一个较大分组的区间，按起始位置下标递增顺序排序后，返回结果
 * @author zhuangpeng
 */
public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < s.length(); i++) {
            //这里要考虑到边界情况，当遍历到最后一个字母时，看看是否满足大于等于三个的条件了
            if (i == (s.length() - 1) || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    result.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
         }

        return result;
    }
}
