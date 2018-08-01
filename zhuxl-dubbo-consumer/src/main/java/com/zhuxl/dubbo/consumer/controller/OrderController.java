package com.zhuxl.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhuxl.dubbo.provider.api.dto.OrderDTO;
import com.zhuxl.dubbo.provider.api.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference(version = "1.0")
    private OrderService orderService;

    @PostMapping("book")
    @ResponseBody
    public ResponseEntity bookOrder(@RequestBody OrderDTO orderDTO) {
        boolean isOk = orderService.bookOrder(orderDTO);
        return new ResponseEntity(isOk, HttpStatus.OK);
    }
}
