package zjfk;

import java.util.Deque;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-05 09:36
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()){
            minStack.push(val);
        }else {
            Integer peek = minStack.peek();
            if (val <= peek){
                minStack.push(val);
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()){
            return;
        }
        Integer pop = stack.pop();
        Integer minNum = minStack.peek();
        if (pop.equals(minNum)){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


}
