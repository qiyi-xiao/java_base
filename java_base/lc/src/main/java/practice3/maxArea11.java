package practice3;

import javax.validation.constraints.Min;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 19:33
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class maxArea11 {


    public int maxArea(int[] height) {
        int max = 0;
        if (height == null || height.length < 2) {
            return 0;
        }

        int leftIndex = 0;
        int rightIndex = height.length - 1;

        while (leftIndex < rightIndex) {

            max = Math.max(max, Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex));

            if (height[leftIndex] < height[rightIndex]){
                int curLeftHeight = height[leftIndex];
                for (leftIndex = leftIndex + 1; leftIndex < rightIndex; leftIndex++) {
                    if (height[leftIndex] > curLeftHeight){
                        break;
                    }
                }
            }else {
                int curRightHeight = height[rightIndex];
                for (rightIndex = rightIndex - 1; rightIndex > leftIndex; rightIndex--) {
                    if (height[rightIndex] > curRightHeight){
                        break;
                    }
                }
            }
        }
        return max;
    }

}
