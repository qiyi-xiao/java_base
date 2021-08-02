package practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-19 21:37
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class groupAnagrams49 {


    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return new ArrayList<>();
        }

        String[] strC = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            strC[i] = String.valueOf(chars);
        }
        Map<String, List<String>> listMap = new HashMap<>();

        for (int i = 0; i < strC.length; i++) {
            List<String> list = listMap.getOrDefault(strC[i], new ArrayList<>());
            list.add(strs[i]);
            listMap.put(strC[i], list);
        }
        List<List<String>> lists = new ArrayList<>();
        Set<Map.Entry<String, List<String>>> entries = listMap.entrySet();

        for (Map.Entry<String, List<String>> m:entries) {
            lists.add(m.getValue());
        }
        return lists;
    }

}
