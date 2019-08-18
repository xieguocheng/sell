package com.sell.service;

import com.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author：XO
 * @Description：WeChat sell
 * @Date： 2018/10/13 21:37
 */

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
