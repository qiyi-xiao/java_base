package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-18 22:26
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class minSubArrayLen209 {

    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null){
            return 0;
        }
        int minLength = Integer.MAX_VALUE;
        int leftIndex = 0;
        int rightIndex = 0;
        int curNumSum = nums[0];
        while (leftIndex <= rightIndex && rightIndex < nums.length){
            if (curNumSum >= target){
                minLength = Math.min(minLength, rightIndex - leftIndex + 1);
                if (minLength == 1){
                    return 1;
                }
                curNumSum = curNumSum - nums[leftIndex];
                leftIndex++;
            }else {
                rightIndex++;
                if (rightIndex < nums.length) {
                    curNumSum = curNumSum + nums[rightIndex];
                }else {
                    break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
