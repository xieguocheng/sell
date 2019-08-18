package com.sell.enums;

import lombok.Getter;

/**
 * @Author：XO
 * @Description：WeChat sell
 * @Date： 2018/10/14 10:13
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{

    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
