package practice6;

import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 21:23
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public interface NestedInteger {
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();
    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();
    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}