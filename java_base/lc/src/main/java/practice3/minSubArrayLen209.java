package practice3;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 19:55
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class minSubArrayLen209 {

    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return target == nums[0] ? 1 : 0;
        }

        int minLength = Integer.MAX_VALUE;

        int leftIndex = 0;
        int rightIndex = 0;
        int sum = nums[0];
        while (leftIndex <= rightIndex && rightIndex < nums.length){
            if (sum >= target) {
                minLength = Math.min(rightIndex - leftIndex + 1, minLength);
                sum -= nums[leftIndex];
                leftIndex++;
            }else if (sum < target){
                rightIndex++;
                if (rightIndex < nums.length) {
                    sum += nums[rightIndex];
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }







}
