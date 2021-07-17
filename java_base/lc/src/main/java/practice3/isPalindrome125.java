package practice3;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 10:26
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isPalindrome125 {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }

        char[] chars = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;

        while (leftIndex < rightIndex){
            if (!Character.isLetterOrDigit(chars[leftIndex])){
                leftIndex++;
                continue;
            }
            if (!Character.isLetterOrDigit(chars[rightIndex])){
                rightIndex--;
                continue;
            }

            if (Character.toLowerCase(chars[leftIndex]) != Character.toLowerCase(chars[rightIndex])) {
                return false;
            }
            leftIndex++;
            rightIndex--;

        }
        return true;
    }

}
