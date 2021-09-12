package two;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-14 15:21
 *  序号后缀说明  * 没做出来  - 调试多次   _ 非一次过     # 二次没过
 *
 * -3
 * 26 80 215 209 3 438 76
 *
 * -4
 * 202- 1 18_ 16- 454*
 *
 * -5
 * 92- 83 82(下次用递归) 25*** 148 19 61
 *
 * -6
 * 94 145 127*** 126*** 279*
 *
 * -7
 * 111 437** 450** 236* 98 108 230
 *
 * -8
 * 216 79 200 130 417 51
 *
 * -9
 * 120 343 91 63 337 309 300
 * 0-1 背包
 * DP
 * https://coding.imooc.com/lesson/82.html#mid=43276
 *
 * -10
 * 455 392 435 279
 **/

public class Abase {



    public static void main(String[] args) {
    }

     Trie[] list = new Trie[26];


    public  void insert(String s){
        char t = s.charAt(0);
        s = s.substring(1);
        list[t - 'a'] =  new Trie(s);
    }

     boolean search(String word){
        int index = word.length();
        while (!"".equals(word)){
            char c = word.charAt(0);
            Trie trie = list[c - 'a'];
            if (trie == null){
                return false;
            }
            word = word.substring(1);
            index--;
        }
        return index == 0;
    }

     boolean startsWith(String prefix){
        while (!"".equals(prefix)){
            char c = prefix.charAt(0);
            Trie trie = list[c - 'a'];
            if (trie == null){
                return false;
            }
            prefix = prefix.substring(1);
        }
        return true;
    }


}

class Trie{
    char t;
    Trie[] list = new Trie[26];

    public Trie(String s){
        if(s == null || "".equals(s)){
            return;
        }
        t = s.charAt(0);
        s = s.substring(1);
        if ("".equals(s)){
            return;
        }
        list[t - 'a'] = new Trie(s);
    }

}

