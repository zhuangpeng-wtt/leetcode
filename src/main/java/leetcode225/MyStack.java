package leetcode225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // 通过两个队列维护 数据，实现队尾插入
    public void push(int x) {
        // 队列末尾追加一个元素
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            // 将queue1的队首元素依次取出来 插入到queue2的末尾
            queue2.offer(queue1.poll());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        // 先进先出
        return queue1.poll();
    }

    public int top() {
        // 查看首个元素, 被查看的元素不会从队列中删除
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
