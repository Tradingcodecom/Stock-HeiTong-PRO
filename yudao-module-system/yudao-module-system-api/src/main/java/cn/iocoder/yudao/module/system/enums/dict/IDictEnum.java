package cn.iocoder.yudao.module.system.enums.dict;

import cn.iocoder.yudao.framework.common.util.I18n.I18nUtil;

public interface IDictEnum {
    int getValue();
    String getMessageKey();

    /**
     * 获取国际化后的标签
     */
    default String getLabel() {
        return I18nUtil.message(getMessageKey());
    }
}

