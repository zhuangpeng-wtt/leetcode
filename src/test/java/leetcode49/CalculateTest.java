package leetcode49;

import org.junit.Test;

public class CalculateTest {

    @Test
    public void groupAnagrams() {
        String[] agrs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        Solution solution49 = new Solution();
        System.out.println(solution49.groupAnagrams(agrs));
    }
}
