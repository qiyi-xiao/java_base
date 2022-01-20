package test;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @description:
 * @author: junmo
 * @create: 2021-11-19 10:24
 **/

public class Test2 {
    public static final List<String> GREAT_CHINA = Lists.newArrayList("TW","MO","HK","SG");

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() + (long) 30 * 24 * 60 * 60 * 1000);
//        String join = String.join("','", GREAT_CHINA);
//        System.out.println(join);
    }

}
