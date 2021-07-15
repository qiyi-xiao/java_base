package practice3;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-15 20:03
 **/

public class removeDuplicates26 {

//    1 2 2 3
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}
