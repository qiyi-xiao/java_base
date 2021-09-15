package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-18 21:44
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class removeDuplicates80 {

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int curIndex = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[curIndex - 1]){
                continue;
            }
            nums[curIndex++] = nums[i];
        }
        return curIndex;
    }

}
