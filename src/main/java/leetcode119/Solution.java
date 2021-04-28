package leetcode119;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuangpeng
 */
public class Solution {

    /**
     * 杨辉三角形公式解法
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add((int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return row;
    }
}
