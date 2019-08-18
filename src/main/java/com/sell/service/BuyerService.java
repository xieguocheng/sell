package com.sell.service;

import com.sell.dto.OrderDTO;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/10/16 15:54
 */

public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消一个用户openid的订单
    OrderDTO cancelOrder(String openid, String orderId);
}
