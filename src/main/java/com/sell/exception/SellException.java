package com.sell.exception;

import com.sell.enums.ResultEnum;

/**
 * @Author：XO
 * @Description：
 * @Date： 2018/10/15 20:52
 */

public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
