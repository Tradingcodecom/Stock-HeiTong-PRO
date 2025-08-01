package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GoodsIposPayStatusEnum implements IDictEnum {
    WJF(0, "dict.goods_ipos_pay_status.WJF"),
    YJF(1, "dict.goods_ipos_pay_status.YJF");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
