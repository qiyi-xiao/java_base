package two;

import java.util.Arrays;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-29 11:42
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class threeSumClosest16 {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3){
            return -1;
        }
        Arrays.sort(nums);
        int closeNum = nums[0] + nums[1] + nums[2];
        int lastCloseSub = Math.abs(closeNum  - target);

        for (int indexI = 0; indexI < nums.length; indexI++) {
            if (indexI != 0 && nums[indexI] == nums[indexI - 1]){
                continue;
            }
            int twoTarget = target - nums[indexI];
            int leftIndex = indexI + 1;
            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex){
                int sub = nums[leftIndex] + nums[rightIndex] - twoTarget;
                if (nums[leftIndex] + nums[rightIndex] == twoTarget){
                    return nums[indexI] + nums[leftIndex] + nums[rightIndex];
                }else if (nums[leftIndex] + nums[rightIndex] < twoTarget){
                    if (Math.abs(sub) < lastCloseSub){
                        lastCloseSub = sub;
                        closeNum = nums[indexI] + nums[leftIndex] + nums[rightIndex];
                    }
                    while (leftIndex < rightIndex) {
                        if (nums[leftIndex + 1] == nums[leftIndex]){
                            leftIndex++;
                        }else {
                            break;
                        }
                    }
                    leftIndex++;
                }else {
                    if (Math.abs(sub) < lastCloseSub){
                        lastCloseSub = sub;
                        closeNum = nums[indexI] + nums[leftIndex] + nums[rightIndex];
                    }
                    while (leftIndex < rightIndex) {
                        if (nums[rightIndex - 1] == nums[rightIndex]){
                            rightIndex--;
                        }else {
                            break;
                        }
                    }
                    rightIndex--;
                }
            }
        }
        return closeNum;
    }

}
