package leetcode26;

import org.junit.Test;

import java.util.Arrays;

public class CalculateTest {

    @Test
    public void removeDuplicates() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        System.out.println(solution.removeDuplicates2(nums));
        System.out.println(Arrays.toString(nums));
    }
}
