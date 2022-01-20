package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.lucene.util.RamUsageEstimator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-16 10:23
 **/

public class Test {

    public static void main(String[] args) {

//        System.out.println(Integer.MAX_VALUE);

        AtomicInteger atomicInteger = new AtomicInteger();
        TestSizeBean testSizeBean = new TestSizeBean();
        testSizeBean.setUid(1);
        testSizeBean.setVjUid(2);
        testSizeBean.setWatchTime(3);
        TestSizeBean testSizeBean2 = new TestSizeBean();
        testSizeBean.setUid(1);
        testSizeBean.setVjUid(2);
        testSizeBean.setWatchTime(3);
        TestSizeBean testSizeBean3 = new TestSizeBean();
        testSizeBean.setUid(1);
        testSizeBean.setVjUid(2);
        testSizeBean.setWatchTime(3);
        TestSizeBean testSizeBean4 = new TestSizeBean();
        testSizeBean.setUid(1);
        testSizeBean.setVjUid(2);
        testSizeBean.setWatchTime(3);

        List<TestSizeBean> list = new ArrayList<>();
        list.add(testSizeBean);
        list.add(testSizeBean2);
        list.add(testSizeBean3);
        list.add(testSizeBean4);
        System.out.println(RamUsageEstimator.sizeOf(list));
        System.out.println(RamUsageEstimator.humanSizeOf(list));
        Integer a = 0;
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(2, 3);
        map.put(1,map1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("1111111111111111111", 100000);

        String s = "a";
        System.out.println(RamUsageEstimator.humanSizeOf(map));
        System.out.println(RamUsageEstimator.humanSizeOf("a"));
        System.out.println(RamUsageEstimator.humanSizeOf("ab"));
        System.out.println(RamUsageEstimator.humanSizeOf("abc"));
        System.out.println(RamUsageEstimator.humanSizeOf("abcd"));


//        long[] arr = {858076006205726721L,2570675L,852752717219471361L,1546496L,840113128137400321L,1519019L,891512212645847051L,1096452L,841468602074112001L,1041031L,843282166917734401L,914987L,850546657589043201L,853630L,854349554146713601L,821541L,873123523589939221L,677841L,830581037295575041L,676234L,852190119448125461L,645073L,849578290082324481L,608532L,848109645348577301L,503856L,841460580913356801L,477705L,865646591559966721L,455970L,873930337406525451L,388295L,841509017490923541L,356505L,890167513692610561L,343389L,874372088356249611L,311874L,845110250732625921L,304778L,841458067521249281L,291472L,854856826542202901L,250298L,850675018639974401L,209622L,873228868864286741L,184597L,841457152874618881L,181613L,841241703316561921L,154386L,848021716932075521L,152652L,841457476111278091L,144825L,850979563574763521L,141289L,841529708700344321L,118321L,874561444789985281L,106629L,857094699436318721L,106498L,868809062039265281L,86058L,855883803559567381L,83777L,853568093272514561L,68657L,841457684589158411L,68200L,873204967033118731L,67795L,876191171981189121L,67669L,895459622170501121L,67397L,864535331220070401L,65255L,876970786499174401L,60831L,873204553015992331L,58964L,862939220345200641L,58430L,841465399356006401L,53851L,841486036039475221L,53300L,865269930441154561L,52029L,874340851756933131L,50209L,873255748142735371L,35514L,877225994840023041L,33364L,876452889876602881L,33214L,873919030226165781L,29996L,872032430011555851L,29794L,853982985435586561L,27330L,854349452678635521L,27173L,873864913184727051L,25310L,874635584628695041L,23765L,844158382068572161L,22350L,841458983732879371L,17200L,850161382704128001L,16528L,853248953819176961L,14542L,874577614219878401L,7672L,841457216140451841L,6924L,1445629837178961920L,5406L,848290355510353921L,4077L,862806007412531221L,3430L,852171161807462401L,1274L,855344467754721301L,739L,888842506425180181L,88L,874736834574131221L,42L,862527585772216321L,35L,863660012879585301L,10L};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= 2570675){
//                System.out.println(arr[i]);
//            }
//        }

//        Thread
//        Runnable


//        String responseStr = "{\"code\":200,\"message\":\"Success\",\"data\":[{\"giftId\":1001,\"image\":\"6a16b1a0cc85216c23f84639945fd2ca\",\"acquisitionTime\":1633958748426,\"count\":3,\"giftPrice\":1000,\"gift_type\":1,\"attr_type\":0,\"gift_tag\":1}]}";
//        JSONObject body = JSONObject.parseObject(responseStr);
//
//        JSONArray date = body.getJSONArray("data");
//        System.out.println(date.toJSONString());
//        List<HonoraryGiftModel> honoraryGiftModels = date.toJavaList(HonoraryGiftModel.class);


//        System.out.println("1,1,1,".split(",").length);
//        Map map = new HashMap();
//        Map<String, String> map2 = new HashMap();
//        map2.put("1", "1");
//        map.putAll(map2);
//        System.out.println(JSON.toJSONString(map));




//        Map<Integer, Map<Integer, Integer>> mapMap = new HashMap<>();
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        mapMap.put(1, map);
//
//        Map<Integer, Integer> map2 = new HashMap<>();
//        map2.put(1,1);
//        map.putAll(map2);
//
//        System.out.println(JSON.toJSONString(mapMap));

//        String s = "123";
//        changeStr(s);
//        System.out.println(s);
    }

    public static void changeStr(String s){
        s = "234";
    }
}
