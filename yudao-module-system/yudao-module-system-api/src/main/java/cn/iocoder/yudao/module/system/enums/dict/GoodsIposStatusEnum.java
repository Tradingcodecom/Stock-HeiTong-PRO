package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GoodsIposStatusEnum implements IDictEnum {
    OPEN(1, "dict.goods_ipos_status.open"),
    CLOSE(2, "dict.goods_ipos_status.close");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
