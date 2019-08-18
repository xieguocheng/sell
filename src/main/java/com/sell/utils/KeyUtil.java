package com.sell.utils;

import java.util.Random;

/**
 * @Author：XO
 * @Description：订单主键生成
 * @Date： 2018/10/15 19:41
 */

public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * synchronized可以防止多比订单提交时线程冲突
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
