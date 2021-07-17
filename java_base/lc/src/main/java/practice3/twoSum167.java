package practice3;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 10:16
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class twoSum167 {

    public int[] twoSum(int[] numbers, int target) {

        int index1 = 0;
        int index2 = numbers.length - 1;

        while (index1 < index2){
            if (numbers[index1] + numbers[index2] == target) {
                return new int[]{index1 + 1 , index2 + 1};
            }else if (numbers[index1] + numbers[index2] > target){
                index2--;
            }else {
                index1++;
            }
        }
        return null;
    }


}
