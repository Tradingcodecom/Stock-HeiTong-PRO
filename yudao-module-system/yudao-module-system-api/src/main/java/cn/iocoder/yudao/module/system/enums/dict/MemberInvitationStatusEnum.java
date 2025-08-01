package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberInvitationStatusEnum implements IDictEnum {
    FYQ(0, "dict.member_invitation_status.FYQ"),
    YZC(1, "dict.member_invitation_status.YZC"),
    YCZ(2, "dict.member_invitation_status.YCZ");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
