package offer09;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue {

    private Deque<Integer> stact1;
    private Deque<Integer> stact2;

    public CQueue() {
        stact1 = new LinkedList<>();
        stact2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stact1.push(value);
    }

    public int deleteHead() {
        if (stact2.isEmpty()) {
            while (!stact1.isEmpty()) {
                stact2.push(stact1.pop());
            }
        }

        if (stact2.isEmpty()) {
            return -1;
        }
        return stact2.pop();
    }
}
