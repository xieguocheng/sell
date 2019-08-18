package com.sell.utils;

import com.sell.enums.CodeEnum;

/**
 * @Author：XO
 * @Description：WeChat sell
 * @Date： 2018/10/14 10:22
 */

public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
