package practice3;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-15 20:18
 **/

public class removeDuplicates80 {

    public int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (q - p > 1 && nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p = q;
                q = p + 1;
            }else {
                q++;
                if (q - p > 1) {
                    index++;
                }
            }
        }

        return nums.length - index;
    }

}
