package test;

import lombok.*;

/**
 * @description:
 * @author: junmo
 * @create: 2021-10-11 17:16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class HonoraryGiftModel {

    private int giftId;

    /** 礼物礼物图片 */
    private String image;

    /**
     * 获得时间
     */
    private long acquisitionTime;

    private int giftPrice;

    private int count;

    /** @see com.mico.live.util.LiveGiftConstants.GiftType */
    private Integer gift_type;
    /** @see com.mico.live.util.LiveGiftConstants.AttributeType */
    private Integer attr_type;
    /** @see com.mico.live.util.LiveGiftConstants.GiftTag 礼物显示tag栏*/
    private Integer gift_tag;

}
