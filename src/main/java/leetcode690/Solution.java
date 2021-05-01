package leetcode690;

import dependency.Employee;

import java.util.*;

/**
 * 690. 员工的重要性
 * @author zhuangpeng
 */
public class Solution {
    int total = 0;
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                total += e.importance;

                if (null == e.subordinates || e.subordinates.size() <= 0) {
                    return total;
                }

                for(int subordinate : e.subordinates) {
                    getImportance(employees, subordinate);
                }
            }
        }

        return total;
    }


    public int getImportance2(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.id, e);
        }

        return dfs(map, id);
    }

    private int dfs(Map<Integer, Employee> map, int id) {
        int total = map.get(id).importance;

        for (int i : map.get(id).subordinates) {
            total += dfs(map, i);
        }

        return total;
    }

    public int getImportance3(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.id, e);
        }

        int total = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(id);
        while (!queue.isEmpty()) {
            int curId = queue.poll();
            Employee employee = map.get(curId);
            total += employee.importance;
            List<Integer> subordinates = employee.subordinates;
            for (int subId : subordinates) {
                queue.offer(subId);
            }
        }
        return total;
    }


}
