package leetcode54;

import org.junit.Test;

import java.util.List;

public class CalculateTest {

    @Test
    public void spiralOrder() {
        Solution solution = new Solution();
        List<Integer> answer = solution.spiralOrder(new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}});
        System.out.println(answer);
    }
}
