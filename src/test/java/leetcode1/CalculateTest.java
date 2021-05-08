package leetcode1;

import org.junit.Test;

import java.util.Arrays;

public class CalculateTest {
    @Test
    public void twoSum() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2,7,11,15}, 9)));
    }
}
