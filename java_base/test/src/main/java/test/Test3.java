package test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: junmo
 * @create: 2021-11-22 17:12
 **/

public class Test3 {
    public static void main(String[] args) {
        LiveTimeRecord liveTimeRecord1 = LiveTimeRecord.builder().uid(1L).startTimeStamp(1635732422184L).endTimeStamp(1636683428648L).build();
        LiveTimeRecord liveTimeRecord2 = LiveTimeRecord.builder().uid(1L).startTimeStamp(1636683428732L).endTimeStamp(1637288435574L).build();
        LiveTimeRecord liveTimeRecord3 = LiveTimeRecord.builder().uid(1L).startTimeStamp(1637293361052L).endTimeStamp(1637318491815L).build();

        LiveTimeRecord liveTimeRecord4 = LiveTimeRecord.builder().uid(2L).startTimeStamp(1636083732793L).endTimeStamp(1636084801051L).build();
        LiveTimeRecord liveTimeRecord5 = LiveTimeRecord.builder().uid(2L).startTimeStamp(1636090841454L).endTimeStamp(1636091603407L).build();
        LiveTimeRecord liveTimeRecord6 = LiveTimeRecord.builder().uid(2L).startTimeStamp(1636091696246L).endTimeStamp(1636094967950L).build();

        List<LiveTimeRecord> list = new ArrayList<>();
        list.add(liveTimeRecord1);
        list.add(liveTimeRecord2);
        list.add(liveTimeRecord3);
        list.add(liveTimeRecord4);
        list.add(liveTimeRecord5);
        list.add(liveTimeRecord6);

        Map<Long, Long> collect = list.stream().collect(Collectors.groupingBy(LiveTimeRecord::getUid, Collectors.summingLong(r -> r.getEndTimeStamp() - r.getStartTimeStamp())));
        System.out.println(JSON.toJSONString(collect));

        long a = 1636683428648L + 1637288435574L + 1637318491815L - 1635732422184L - 1636683428732L - 1637293361052L;
        System.out.println(a);


    }
}
