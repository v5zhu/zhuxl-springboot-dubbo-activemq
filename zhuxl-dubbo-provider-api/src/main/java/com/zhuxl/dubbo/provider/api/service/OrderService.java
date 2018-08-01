package com.zhuxl.dubbo.provider.api.service;

import com.zhuxl.dubbo.provider.api.dto.OrderDTO;

public interface OrderService {

    boolean bookOrder(OrderDTO orderDTO);
}
