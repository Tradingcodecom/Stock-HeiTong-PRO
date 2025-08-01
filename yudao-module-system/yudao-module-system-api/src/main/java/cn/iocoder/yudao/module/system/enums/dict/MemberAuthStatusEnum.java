package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberAuthStatusEnum implements IDictEnum {
    WRZ(0, "dict.member_auth_status.WRZ"),
    SHZ(1, "dict.member_auth_status.SHZ"),
    YRZ(1, "dict.member_auth_status.YRZ"),
    RZSB(1, "dict.member_auth_status.RZSB");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
