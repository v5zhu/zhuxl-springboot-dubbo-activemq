package com.zhuxl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhuxl.dubbo.provider.activemq.producer.OrderProducer;
import com.zhuxl.dubbo.provider.api.dto.OrderDTO;
import com.zhuxl.dubbo.provider.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(version = "1.0")
@Component
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderProducer orderProducer;

    @Override
    public boolean bookOrder(String orderDTO) {
        // 下单完成后发送消息
        // 主线程阻塞5秒模拟下单
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 发送消息
        orderProducer.sendOrder(orderDTO);
        return true;
    }
}
