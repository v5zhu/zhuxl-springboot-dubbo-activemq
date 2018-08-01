package com.zhuxl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.zhuxl.dubbo.provider.api.dto.OrderDTO;
import com.zhuxl.dubbo.provider.api.service.OrderService;
import org.springframework.stereotype.Component;

@Service(version = "1.0")
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public boolean bookOrder(OrderDTO orderDTO) {
        System.out.println("接收到下单请求:" + JSONObject.toJSON(orderDTO));
        System.out.println("下单成功");
        return true;
    }
}
