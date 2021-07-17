package practice3;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 07:55
 * @description： TODO
 * @modified By：0.0
 * @version: 1.0.0
 */

public class mergemn88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;
        n = n - 1;
        for (int i = nums1.length - 1; i >= 0 && m >= 0 && n >= 0; i--) {
            if (nums2[n] > nums1[m]){
                nums1[i] = nums2[n--];
            }else {
                nums1[i] = nums1[m--];
            }

        }

        if (m < 0){
            for (int i = n; i >=0 ; i--) {
                nums1[i] = nums2[n--];
            }
        }

    }

}
