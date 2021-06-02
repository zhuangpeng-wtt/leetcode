package leetcode709;

/**
 * @author zhuangpeng
 */
public class Solution {
    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            char res = charAt >= 'A' && charAt <= 'Z' ? (char) (charAt + 32) : charAt;
            stringBuilder.append(res);
        }

        return stringBuilder.toString();
    }


    /**
     * 使用底层机制
     * 大写变小写、小写变大写：字符 ^= 32 （大写 ^= 32 相当于 +32，小写 ^= 32 相当于 -32）
     * 大写变小写、小写变小写：字符 |= 32 （大写 |= 32 就相当于+32，小写 |= 32 不变）
     * 大写变大写、小写变大写：字符 &= -33 （大写 ^= -33 不变，小写 ^= -33 相当于 -32）
     * @param s
     * @return
     */
    public void toLowerCase2(String s) {
        System.out.println((char)('A' | 32));
    }

}
