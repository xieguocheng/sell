package com.sell.repository;

import com.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author：XO
 * @Description：
 * @Date： 2018/10/14 10:29
 */

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    //查找所有指定的status
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
