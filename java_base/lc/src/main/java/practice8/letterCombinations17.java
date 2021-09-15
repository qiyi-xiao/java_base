package practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-29 22:55
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class letterCombinations17 {


    private static Map<Character, List<String>> map = new HashMap<>();

    static {
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null) {
            return new ArrayList<>();
        }
        char[] chars = digits.toCharArray();
        backTrace(chars, 0, new StringBuilder());
        return list;
    }

    private void backTrace(char[] chars, int curIndex, StringBuilder sb) {
        if (curIndex == chars.length) {
            list.add(sb.toString());
            return;
        }
        List<String> list = map.get(chars[curIndex]);
        for (String s : list) {
            sb.append(s);
            backTrace(chars, ++curIndex, sb);
            sb.deleteCharAt(curIndex);
        }
    }


}
