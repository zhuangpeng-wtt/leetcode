package leetcode168;

/**
 * @author zhuangpeng
 */
public class Solution {

    public String convertToTitle(int columnNumber) {
        StringBuilder buffer = new StringBuilder();
        while (columnNumber != 0) {
            int remainder = columnNumber % 26 == 0 ? 26 : columnNumber % 26;
            char res = (char) (64 + remainder);
            buffer.insert(0, res);
            columnNumber = (columnNumber - remainder) / 26;
        }

        return buffer.toString();
    }


    public static void main(String[] args) {
        System.out.println(27 % 26);
    }
}
