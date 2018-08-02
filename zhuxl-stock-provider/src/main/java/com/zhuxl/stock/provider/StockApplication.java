package com.zhuxl.stock.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhuxiaolong@aspirecn.com
 * @project zhuxl-springboot-dubbo-activemq
 * @package com.zhuxl.stock.provider
 * @date 2018/8/2 12:52
 */
@SpringBootApplication
public class StockApplication {
    public static void main(String[] args) {
        new SpringApplication(StockApplication.class).run(args);
    }
}
