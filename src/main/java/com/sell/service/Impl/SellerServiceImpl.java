package com.sell.service.Impl;

import com.sell.dataobject.SellerInfo;
import com.sell.repository.SellerInfoRepository;
import com.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/10/16 17:01
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
