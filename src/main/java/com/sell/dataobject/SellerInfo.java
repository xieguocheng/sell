package com.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author：XO
 * @Description：WeChat sell
 * @Date： 2018/10/14 10:38
 */
@Entity //实体类
@Data   //需要下载lombok插件和maven中导入包，才能包含get，set ，toString等方法
//@DynamicUpdate  //动态更新时间
public class SellerInfo {

    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

    public SellerInfo(){
    }
}
