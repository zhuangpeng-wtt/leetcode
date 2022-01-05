package leetcode645;

import org.junit.Test;

import java.util.Arrays;

public class CalculateTest {

    @Test
    public void findErrorNums() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findErrorNums(new int[]{1, 1})));
    }
}
