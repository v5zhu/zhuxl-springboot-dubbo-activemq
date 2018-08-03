package com.zhuxl.dubbo.provider.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhuxiaolong@aspirecn.com
 * @project zhuxl-springboot-dubbo-activemq
 * @package com.zhuxl.dubbo.provider.service.impl
 * @date 2018/8/2 12:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderProducerTest {

    @Autowired
    private OrderServiceImpl orderService;


    @Test
    public void bookOrder() {
        for (int i = 0; i < 10; i++) {
            orderService.bookOrder("message>" + i);
        }
    }
}
