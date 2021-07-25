package practice6;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 10:57
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isValid20 {

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (!map.containsKey(aChar)) {
                stack.push(aChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop != map.get(aChar)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
