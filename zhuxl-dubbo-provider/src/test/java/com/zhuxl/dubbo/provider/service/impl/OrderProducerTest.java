package com.zhuxl.dubbo.provider.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhuxl.dubbo.provider.api.dto.OrderDTO;
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
        OrderDTO order = new OrderDTO();
        order.setName("苹果手机iphone 6s");
        order.setOrderId("mcc2018080212121200010003");
        orderService.bookOrder(JSONObject.toJSONString(order));
    }
}
