package leetcode54;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 m 行 n 列的矩阵matrix ,
 * @author zhuangpeng
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answert = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return answert;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int total = rows * cols;
        int row = 0, column = 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            answert.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= cols || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }

        return answert;
    }
}
