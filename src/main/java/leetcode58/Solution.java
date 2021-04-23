package leetcode58;

/**
 * 58. 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0
 * @author zhuangpeng
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}
