package competition;

import java.util.HashSet;
import java.util.Set;

/**
 * 5637. 判断字符串的两半是否相似
 *
 * 给你一个偶数长度的字符串 s 。将其拆分成长度相同的两半，前一半为 a ，后一半为 b 。
 * 两个字符串 相似 的前提是它们都含有相同数目的元音（'a'，'e'，'i'，'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。
 * 如果 a 和 b 相似，返回 true ；否则，返回 false 。
 * @author zhuangpeng
 */
public class Question5637 {

    public static boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int min = s.length()/2;
        String a = s.substring(0, min);
        String b = s.substring(min);

        int aVowel = 0;
        int bVowel = 0;
        for(int i = 0; i < a.length(); i++) {
            if(set.contains(a.charAt(i))) {
                aVowel++;
            }
        }

        for(int i = 0; i < b.length(); i++) {
            if(set.contains(b.charAt(i))) {
                bVowel++;
            }
        }
        return  aVowel == bVowel;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("AbCdEfGh"));
    }
}
