package two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-29 11:13
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class fourSum18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int threeTarget = target - nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int twoTarget = threeTarget - nums[j];

                int leftIndex = j + 1;
                int rightIndex = nums.length - 1;
                while (leftIndex < rightIndex){
                    if (nums[leftIndex] + nums[rightIndex] == twoTarget){
                        result.add(Arrays.asList(nums[i], nums[j], nums[leftIndex], nums[rightIndex]));
                        while (leftIndex < rightIndex) {
                            if (nums[leftIndex + 1] == nums[leftIndex]){
                                leftIndex++;
                            }else {
                                break;
                            }
                        }
                        leftIndex++;
                    }else if (nums[leftIndex] + nums[rightIndex] < twoTarget){
                        while (leftIndex < rightIndex) {
                            if (nums[leftIndex + 1] == nums[leftIndex]){
                                leftIndex++;
                            }else {
                                break;
                            }
                        }
                        leftIndex++;
                    }else {
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
        }

        return result;
    }





}
