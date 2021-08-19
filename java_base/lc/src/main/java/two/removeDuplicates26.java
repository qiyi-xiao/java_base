package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-18 21:30
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class removeDuplicates26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int curIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                continue;
            }
            nums[curIndex++] = nums[i];
        }
        return curIndex;
    }


}
