package leetcode2047;

/**
 * @author zhuangpeng
 */
public class Solution {

    public int countValidWords(String sentence) {
        int ans = 0;
        String[] strings = sentence.split(" ");

        for (int i = 0; i < strings.length; i++) {
            if (isValidWord(strings[i])) {
                ans++;
            }
        }
        return ans;
    }

    private boolean isValidWord(String sentence) {
        // 1、空的或者数字false
        if (null == sentence || sentence.isEmpty()) {
            return false;
        }

        boolean flag = false;
        for (int i = 0; i < sentence.length(); i++) {
            // 判断单词是否是是10进制的数字，是的话直接返回false
            if(Character.isDigit(sentence.charAt(i))) {
                return false;
            }
            else if ('-' == sentence.charAt(i)) {
                // 遇到连字符，判断两端是不是字母，不是的false
                if (flag) {
                    return false;
                }
                flag = true;
                if (i == 0 || i == sentence.length() - 1) {
                    return false;
                }
                // 判断其前后是否是字母
                if (!Character.isLetter(sentence.charAt(i - 1)) || !Character.isLetter(sentence.charAt(i + 1))) {
                    return false;
                }
            } else if (!Character.isLowerCase(sentence.charAt(i))){
                // 判断字符两端是不是字母，不是的false
                if (i != 0 && i != sentence.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
