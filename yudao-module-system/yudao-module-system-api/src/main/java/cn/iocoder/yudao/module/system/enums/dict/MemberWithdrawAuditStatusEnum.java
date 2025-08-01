package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberWithdrawAuditStatusEnum implements IDictEnum {
    CLZ(1, "dict.member_withdraw_audit_status.CLZ"),
    CG(2, "dict.member_withdraw_audit_status.CG"),
    SB(3, "dict.member_withdraw_audit_status.SB");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }

}
