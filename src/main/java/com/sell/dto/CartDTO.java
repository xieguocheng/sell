package com.sell.dto;

/**
 * @Author：XO
 * @Description：购物车
 * @Date： 2018/10/15 19:54
 */

import lombok.Data;

@Data
public class CartDTO {
    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
