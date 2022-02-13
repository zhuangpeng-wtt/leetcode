package twentyDayPractice.day04;

/**
 * @author zhuangpeng
 */
public class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public String reverseWords(String s) {
        int len = s.length();
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();

        while(i < len) {
            int start = i;
            // 找到一个完整的单词
            while (i < len && s.charAt(i) != ' ') {
                i++;
            }

            // 反转单词字母
            for (int n = start; n < i; n++) {
                stringBuffer.append(s.charAt(start + i - 1 - n));
            }

            //找到下一个单词的开头
             while (i < len && s.charAt(i) == ' ') {
                 stringBuffer.append(s.charAt(i));
                 i++;
             }
        }

        return stringBuffer.toString();
    }
}
