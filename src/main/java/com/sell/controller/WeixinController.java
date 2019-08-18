package com.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author： XO
 * @Description：
 * @Date： 2018/10/17 14:07
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法。。。");
        log.info("code={}", code);
        String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=" +
                "wx402ace8cc6143623&secret=d5fa7a9b2e183c6c40cbfb43c2e3579c&code=" +
                code+"&grant_type=authorization_code";
        /*String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=\n" +
                "wx402ace8cc6143623&secret=d5fa7a9b2e183c6c40cbfb43c2e3579c&code=" +
                 code + "&grant_type=authorization_code";*/
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);
    }
}
