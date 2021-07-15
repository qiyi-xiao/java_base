package practice3;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-15 20:18
 **/

public class removeDuplicates80 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int p = 0;
        int index = 1;
        for (int q = 1; q < nums.length; q++) {
            if (nums[p] != nums[q]){
                nums[index++] = nums[q];
                p = q;
                q = p;
            }else if (q - p > 1 && nums[p] == nums[q]){
                continue;
            }else if (q - p <= 1){
                nums[index++] = nums[q];
            }
        }

        return index - 1;
    }

}
