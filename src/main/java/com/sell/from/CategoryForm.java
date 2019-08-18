package com.sell.from;

import lombok.Data;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/10/16 12:45
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
