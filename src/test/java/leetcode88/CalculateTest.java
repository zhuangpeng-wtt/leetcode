package leetcode88;

import org.junit.Test;

import java.util.Arrays;

public class CalculateTest {

    @Test
    public void mergeTest() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        solution.merge3(nums1, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
