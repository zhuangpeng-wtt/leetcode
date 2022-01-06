package leetcode71;

import org.junit.Test;

public class CalculateTest {

    @Test
    public void simplifyPath() {
        Solution solution = new Solution();
        System.out.println(solution.simplifyPath("/a/./b/../../c/d"));
    }
}
