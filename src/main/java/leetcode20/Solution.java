package leetcode20;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需要满足：
 *      1.左括号必须用相同类型的
 *      2.左括号必须以正确的顺序闭合
 * 注意空字符串可被认为是有效字符串
 * @author zhuangpeng
 */
public class Solution {
    /**
     * Deque 双端队列，实现方式一般为链表  Deque deque = new LinkedList()
     * java Stack类已经过时，官方推荐使用Deque 替代Stack使用。Deque作为堆栈操作方法一般如下
     * push() 入栈，也可以说是压栈
     * pop() 出栈，获取栈顶元素，获取后该元素就从栈中被删除了
     * peek() 同样的出栈操作，但是不会将元素删除
     * @param s
     * @return
     */

    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>(3) {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Deque<Character> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            //使用HashMap 当获取到右括号的时候，比较栈里的是否是成对的左括号
            //错误条件：栈里为空或者栈顶取出来的不是成对的括号
            if (pairs.containsKey(charAt)) {
                if(stack.isEmpty() || !stack.peek().equals(pairs.get(charAt))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(charAt);
            }
        }
        return stack.isEmpty();
    }
}
