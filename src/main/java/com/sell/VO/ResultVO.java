package com.sell.VO;

import lombok.Data;

/**
 * @Author：XO
 * @Description：前端json数据格式
 * @Date： 2018/10/14 11:24
 */

@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
