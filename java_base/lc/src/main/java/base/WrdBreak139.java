package base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-01 20:44
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class WrdBreak139 {



    public  boolean wordBreak(String s, List<String> wordDict) {
        if (s == null) {
            return false;
        }
        PriorityQueue queue = new PriorityQueue();
        queue.add(new Object());



        Set<String> set = new HashSet<>();
        backTrace(wordDict, 0, new StringBuilder(), 0, set);
        return set.contains(s);
    }

    private  void backTrace(List<String> wordDict, int curIndex, StringBuilder sbd, int length,Set<String> set) {
        if (sbd.toString().length() == wordDict.size()){
            set.add(sbd.toString());
        }
        for (int i = curIndex; i < wordDict.size(); i++) {
            swap(wordDict, curIndex ,i);
            sbd.append(wordDict.get(i));
            length += wordDict.get(i).length();
            backTrace(wordDict, i + 1, sbd,length, set);
            sbd.replace(length - wordDict.get(i).length() ,length,"");
        }
    }

    public  void swap(List<String> wordDict, int a, int b){
        String s = wordDict.get(a);
        wordDict.set(a, wordDict.get(b));
        wordDict.set(b, s);
    }

}
