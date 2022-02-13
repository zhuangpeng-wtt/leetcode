package leetcode539;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTest {

    @Test
    public void getMinutes() {
        Solution solution = new Solution();
        List<String> arr = new ArrayList<>();
        arr.add("23:59");
        arr.add("00:00");

        System.out.println(solution.findMinDifference(arr));
    }
}
