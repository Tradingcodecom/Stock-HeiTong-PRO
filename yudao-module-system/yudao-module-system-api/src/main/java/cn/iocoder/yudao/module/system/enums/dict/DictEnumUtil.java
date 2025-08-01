package cn.iocoder.yudao.module.system.enums.dict;

import java.util.Arrays;

public class DictEnumUtil {

    /**
     * 根据枚举类和 value 获取国际化标签
     *
     * @param enumClass 枚举类，必须实现 IDictEnum 接口
     * @param value     枚举值
     * @return 国际化后的 label
     */
    public static <T extends Enum<T> & IDictEnum> String getLabel(Class<T> enumClass, int value) {
        return Arrays.stream(enumClass.getEnumConstants())
                .filter(e -> e.getValue() == value)
                .findFirst()
                .map(IDictEnum::getLabel)
                .orElse(null);
    }
}
