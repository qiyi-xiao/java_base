package practice3;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-15 19:43
 *
 * 283 27 26 80 75 88 215 167 125 344 345 11 209 3 438 76
 **/

public class Abase {


    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
