package com.sell.service;

import com.sell.dataobject.SellerInfo;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/10/16 16:25
 */

public interface SellerService {
    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);

}
