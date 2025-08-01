package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberRechargeTypeEnum implements IDictEnum {
    RGCZ(1, "dict.member_recharge_type.RGCZ"),
    ZDCZ(2, "dict.member_recharge_type.ZDCZ");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
