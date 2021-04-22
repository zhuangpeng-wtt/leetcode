package leetcode189;

import org.junit.Test;

import java.util.Arrays;

public class Calculate {

    @Test
    public void rotate() {
        Solution solution = new Solution();
        int[] nums = new int[]{-1,-100,3,99};
        solution.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
