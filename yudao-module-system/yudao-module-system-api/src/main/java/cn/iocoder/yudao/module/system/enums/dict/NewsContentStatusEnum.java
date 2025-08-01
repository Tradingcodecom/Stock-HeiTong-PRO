package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NewsContentStatusEnum implements IDictEnum {
    CG(1, "dict.news_content_status.CG"),
    YFB(2, "dict.news_content_status.YFB"),
    YXJ(3, "dict.news_content_status.YXJ");

    private final int value;
    private final String messageKey;

    @Override
    public String getLabel() {
        return I18nUtil.message(messageKey);
    }
}
