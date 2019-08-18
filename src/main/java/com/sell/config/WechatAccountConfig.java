package com.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author： XO
 * @Description： 测试号相关信息的配置类
 * @Date： 2018/10/17 13:59
 */


@Data
@Component
@ConfigurationProperties(prefix = "wechat")     // 载入配置文件里前缀为wechat的配置信息
public class WechatAccountConfig {

    /**
     * 公众平台id
     */
    private String mpAppId;

    /**
     * 公众平台密钥
     */
    private String mpAppSecret;

    /**
     * 开放平台id
     */
    private String openAppId;

    /**
     * 开放平台密钥
     */
    private String openAppSecret;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 微信支付异步通知地址
     */
   private String notifyUrl;

    /**
     * 微信模版id
     */
    private Map<String, String> templateId;
}
