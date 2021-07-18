package practice3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 20:27
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class lengthOfLongestSubstring3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int maxLength = 1;
        int leftIndex = 0;
        int rightIndex = 1;
        set.add(chars[0]);
        while (leftIndex <= rightIndex && rightIndex < chars.length) {
            if (!set.contains(chars[rightIndex])) {
                set.add(chars[rightIndex]);
                maxLength = Math.max(rightIndex - leftIndex + 1 , maxLength);
                rightIndex++;
            }else {
                for (leftIndex = leftIndex; leftIndex < rightIndex ; leftIndex++) {
                    set.remove(chars[leftIndex]);
                    if (chars[leftIndex] == chars[rightIndex]){
                        leftIndex++;
                        break;
                    }
                }
            }
        }
        return maxLength;
    }

}
