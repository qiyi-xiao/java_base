package practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-18 21:45
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class threeSum15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            int target = -nums[i];
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;
            while (leftIndex < rightIndex) {
                if (nums[leftIndex] + nums[rightIndex] == target) {
                    lists.add(Arrays.asList(nums[i], nums[leftIndex], nums[rightIndex]));
                    int temp = nums[leftIndex];
                    for (leftIndex = leftIndex ; leftIndex < rightIndex; leftIndex++){
                        if (nums[leftIndex] != temp){
                            break;
                        }
                    }
                }else if (nums[leftIndex] + nums[rightIndex] > target){
                    int temp = nums[rightIndex];
                    for (rightIndex = rightIndex; rightIndex > leftIndex ; rightIndex--) {
                        if (temp != nums[rightIndex]){
                            break;
                        }
                    }
                } else {
                    int temp = nums[leftIndex];
                    for (leftIndex = leftIndex ; leftIndex < rightIndex; leftIndex++){
                        if (nums[leftIndex] != temp){
                            break;
                        }
                    }
                }
            }
        }
        return lists;
    }



}
