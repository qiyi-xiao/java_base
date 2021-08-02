package practice4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-18 21:25
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class twoSum1 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length ==0) {
            return new int[0];
        }
        if (nums.length == 1){
            return new int[0];
        }
        Map<Integer, Integer> mappingIndex = new HashMap<>();
        Map<Integer, Integer> mappingIndex2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mappingIndex.containsKey(nums[i])) {
                mappingIndex2.put(nums[i], i);
            }else {
                mappingIndex.put(nums[i], i);
            }
        }

        Arrays.sort(nums);

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            if (nums[leftIndex] + nums[rightIndex] == target) {
                if (nums[leftIndex] == nums[rightIndex]){
                    return new int[]{mappingIndex.get(nums[leftIndex]), mappingIndex2.get(nums[rightIndex])};
                }else {
                    return new int[]{mappingIndex.get(nums[leftIndex]), mappingIndex.get(nums[rightIndex])};
                }
            }
            if (nums[leftIndex] + nums[rightIndex] > target) {
                rightIndex--;
            }else {
                leftIndex++;
            }

        }
        return new int[0];
    }



}
