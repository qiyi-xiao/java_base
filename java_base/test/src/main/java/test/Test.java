package test;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-16 10:23
 **/

public class Test {

    public static void main(String[] args) {
        String s = "123";
        changeStr(s);
        System.out.println(s);
    }

    public static void changeStr(String s){
        s = "234";
    }
}
