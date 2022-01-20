package test;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 直播时长记录
 * @author: junmo
 * @create: 2021-11-04 15:31
 **/

@Data
@Builder
public class LiveTimeRecord implements Serializable {

    private long uid;
    private long startTimeStamp;
    private long endTimeStamp;
    private int gameId;
    private int isSigned;

}
