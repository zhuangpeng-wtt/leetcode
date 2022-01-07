package leetcode225;

import org.junit.Test;

public class CalculateTest {

    @Test
    public void test() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());
    }
}
