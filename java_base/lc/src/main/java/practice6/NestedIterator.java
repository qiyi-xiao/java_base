package practice6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 21:01
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class NestedIterator implements Iterator<Integer> {
    List<Integer> list = new ArrayList<>();
    ListIterator<Integer> listIterator;
    public NestedIterator(List<NestedInteger> nestedList) {
        dfs(nestedList);
        listIterator = list.listIterator();
    }
    private void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger nt:nestedList) {
            if (nt.isInteger()) {
                list.add(nt.getInteger());
            }else {
                dfs(nt.getList());
            }
        }
    }
    @Override
    public Integer next() {
        return listIterator.next();
    }
    @Override
    public boolean hasNext() {
        return listIterator.hasNext();
    }
}