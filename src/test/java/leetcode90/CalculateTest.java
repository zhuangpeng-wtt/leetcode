package leetcode90;

import org.junit.Test;

import java.util.List;

public class CalculateTest {

    @Test
    public void subsetsWithDup() {
        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsetsWithDup(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}
