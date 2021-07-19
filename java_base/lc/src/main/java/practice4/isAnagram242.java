package practice4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-18 19:37
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isAnagram242 {


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charsS = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < charsS.length; i++) {
            map.put(charsS[i],map.getOrDefault(charsS[i],0) + 1);
        }

        char[] charsT = t.toCharArray();
        for (int i = 0; i < charsT.length; i++) {
            Integer orDefault = map.getOrDefault(charsT[i], 0);
            if (orDefault <= 0) {
                return false;
            }
            map.put(charsT[i],map.get(charsT[i]) - 1);
        }
        return true;
    }

}
