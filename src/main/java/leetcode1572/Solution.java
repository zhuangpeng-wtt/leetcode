package leetcode1572;

/**
 * 1572. 矩阵对角线元素的和
 * @author zhuangpeng
 */
public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size-1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    public int diagonalSum2(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        int min = size / 2;
        for (int i = 0; i < size; i++) {
            sum += mat[i][i] + mat[i][size - i - 1];
        }
        return sum - mat[min][min] * (min & 1);
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {{1,2,4},{1,2,4},{1,2,4}};
        System.out.println(a.length);
    }
}
