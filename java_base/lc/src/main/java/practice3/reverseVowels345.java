package practice3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 10:43
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reverseVowels345 {

    public String reverseVowels(String s) {
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
        char[] chars = s.toCharArray();

        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (!set.contains(chars[leftIndex])) {
                leftIndex++;
                continue;
            }
            if (!set.contains(chars[rightIndex])) {
                rightIndex--;
                continue;
            }
            char temp = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }

        return String.valueOf(chars);
    }


}
