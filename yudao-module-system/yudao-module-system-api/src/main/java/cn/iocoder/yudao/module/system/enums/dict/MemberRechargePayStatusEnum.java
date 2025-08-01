package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberRechargePayStatusEnum implements IDictEnum {
    DZF(1, "dict.member_recharge_pay_status.DZF"),
    YZF(2, "dict.member_recharge_pay_status.YZF"),
    YGQ(3, "dict.member_recharge_pay_status.YGQ");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
