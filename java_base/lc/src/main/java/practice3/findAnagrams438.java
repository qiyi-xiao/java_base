package practice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 20:49
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class findAnagrams438 {

    public static void main(String[] args) {
        //"cbaebabacd"
        //"abc"

        System.out.println(findAnagrams("acdcaeccde", "c"));
    }


    public static List<Integer> findAnagrams(String s, String p) {
        if (s == null || p == null) {
            return new ArrayList<>();
        }

        char[] charsP = p.toCharArray();
        Map<Character, Integer> mapP = new HashMap<>();
        for (char c : charsP) {
            mapP.put(c, mapP.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> winMap = new HashMap<>();

        int pLength = charsP.length;
        char[] charsS = s.toCharArray();

        LinkedList<Integer> list = new LinkedList<>();
        if (pLength == 1) {
            for (int i = 0; i < charsS.length; i++) {
                if (charsS[i] == charsP[0]){
                    list.add(i);
                }
            }
            return list;
        }



        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex <= rightIndex && rightIndex < charsS.length) {

            if (!mapP.containsKey(charsS[rightIndex])){
                leftIndex = rightIndex + 1;
                rightIndex = leftIndex;
                winMap = new HashMap<>();
                for (rightIndex = rightIndex; rightIndex < charsS.length; rightIndex++){
                    if (mapP.containsKey(charsS[rightIndex])) {
                        winMap.put(charsS[rightIndex], 1);
                        break;
                    }
                }
                leftIndex = rightIndex;
                rightIndex = leftIndex + 1;
                continue;
            }

            int rightCount = winMap.getOrDefault(charsS[rightIndex], 0) + 1;
            if (rightCount >  mapP.get(charsS[rightIndex])) {
                for (leftIndex = leftIndex; leftIndex < rightIndex; leftIndex++) {
                    winMap.put(charsS[leftIndex], winMap.get(charsS[leftIndex]) - 1);
                    if (charsS[leftIndex] == charsS[rightIndex]){
                        leftIndex++;
                        break;
                    }
                }
                winMap.put(charsS[rightIndex], winMap.getOrDefault(charsS[rightIndex], 0) + 1);
                rightIndex++;
                continue;
            }
            winMap.put(charsS[rightIndex], rightCount);

            if (rightIndex - leftIndex + 1 == pLength){
                list.add(leftIndex);
                winMap.put(charsS[leftIndex], winMap.get(charsS[leftIndex]) - 1);
                leftIndex++;
                rightIndex++;
                continue;
            }

            rightIndex++;
        }

        return list;
    }




}
