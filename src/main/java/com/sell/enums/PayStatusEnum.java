package com.sell.enums;

import lombok.Getter;

/**
 * @Author：XO
 * @Description：WeChat sell
 * @Date： 2018/10/14 10:13
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
