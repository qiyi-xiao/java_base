package practice4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-19 21:55
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class maxPoints149 {

    public static void main(String[] args) {
        System.out.println(maxPoints(new int[][]{{2, 3}, {3, 3}, {-5, 3}}));
    }

    public static int maxPoints(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        int maxPoint = 0;

        for (int i = 0; i < points.length; i++) {
            int[] point1 = points[i];

            Map<String, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                int[] point2 = points[j];
                int y = point2[1] - point1[1];
                int x = point2[0] - point1[0];
                String ratio = getRatio(x, y);
                map.put(ratio, map.getOrDefault(ratio, 0) + 1);
            }
            int maxV = 0;
            for (Integer v : map.values()) {
                maxV = Math.max(maxV, v);
            }
            maxPoint = Math.max(maxPoint, maxV + 1);
        }
        return maxPoint;
    }


    public static String getRatio(int a, int b) {
        if (a < b) {
            int c = b;
            b = a;
            a = c;
        }
        int gcd = gcd(a, b);
        return a/ gcd +"_" + b / gcd;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


}
