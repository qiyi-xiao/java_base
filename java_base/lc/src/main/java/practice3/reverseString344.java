package practice3;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 10:40
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reverseString344 {

    public void reverseString(char[] s) {
        if (s == null || s.length < 2){
            return;
        }
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        while (leftIndex < rightIndex){
            char a = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = a;
            leftIndex++;
            rightIndex--;
        }
    }

}
