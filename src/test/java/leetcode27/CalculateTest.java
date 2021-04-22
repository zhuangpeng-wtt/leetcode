package leetcode27;

import org.junit.Test;

import java.util.Arrays;

public class CalculateTest {

    @Test
    public void removeElement() {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 2, 2, 3};

        System.out.println(solution.removeElemen2(nums, 3));
        System.out.println(Arrays.toString(nums));
    }
}
