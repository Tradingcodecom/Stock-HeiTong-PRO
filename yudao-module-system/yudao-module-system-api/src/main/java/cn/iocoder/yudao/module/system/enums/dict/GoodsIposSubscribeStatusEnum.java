package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GoodsIposSubscribeStatusEnum implements IDictEnum {
    YSG(1, "dict.goods_ipos_subscribe_status.YSG"),
    WZQ(2, "dict.goods_ipos_subscribe_status.WZQ"),
    YZQ(3, "dict.goods_ipos_subscribe_status.YZQ"),
    YJN(4, "dict.goods_ipos_subscribe_status.YJN"),
    YCC(5, "dict.goods_ipos_subscribe_status.YCC");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
