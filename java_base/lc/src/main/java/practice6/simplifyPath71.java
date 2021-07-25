package practice6;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 15:45
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class simplifyPath71 {


    public String simplifyPath(String path) {
        if (path == null) {
            return null;
        }
        LinkedList<String> list = new LinkedList<>();

        String[] split = path.split("/");


        for (int i = 0; i < split.length; i++) {
            if (!".".equals(split[i]) && !"..".equals(split[i]) && split[i].length() > 0){
                list.addLast(split[i]);
            } else if ("..".equals(split[i])) {
                if (list.size() > 0) {
                    list.removeLast();
                }
            }

        }
        if (list.size() == 0) {
            return "/";
        }
        StringBuffer sb = new StringBuffer();
        for (String s:list) {
            sb.append("/");
            sb.append(s);
        }
        return sb.toString();
    }

}
