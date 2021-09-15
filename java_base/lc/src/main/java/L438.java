import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: junmo
 * @create: 2021-08-19 15:27
 **/

public class L438 {


    public List<Integer> findIndex(String s, String target) {
        List<Integer> result = new ArrayList<>();
        if (s == null) {
            return result;
        }
        char[] targetChars = target.toCharArray();
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < targetChars.length; i++) {
            targetMap.put(targetChars[i], targetMap.getOrDefault(targetChars[i], 0));
        }
        Map<Character, Integer> curMap = new HashMap<>();

        char[] chars = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex <= rightIndex && rightIndex < chars.length) {
            if (!targetMap.containsKey(chars[rightIndex])) {
                leftIndex = rightIndex + 1;
                rightIndex = leftIndex;
            } else {
                Integer targetNum = targetMap.get(chars[rightIndex]);
                Integer curNum = curMap.getOrDefault(chars[rightIndex], 0) + 1;
                if (curNum > targetNum) {
                    for (; leftIndex < rightIndex; leftIndex++) {
                        if (chars[leftIndex] == chars[rightIndex]) {
                            break;
                        }
                    }
                }
            }


        }
        return result;
    }

}
