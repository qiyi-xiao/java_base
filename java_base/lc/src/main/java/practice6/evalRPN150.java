package practice6;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 11:05
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class evalRPN150 {

    public int evalRPN(String[] tokens) {
        if (tokens == null) {
            return -1;
        }
        if (tokens.length == 1) {
            return Integer.valueOf(tokens[0]);
        }
        Set<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        int num = 0;


        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!set.contains(tokens[i])) {
                stack.add(Integer.valueOf(tokens[i]));
            }else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (tokens[i]){
                    case "+":
                        num = num1 + num2;
                        break;
                    case "-":
                        num = num1 - num2;
                        break;
                    case "*":
                        num = num1 * num2;
                        break;
                    case "/":
                        num = num1 / num2;
                        break;
                }
                stack.push(num);
            }
        }
        return num;
    }




}
