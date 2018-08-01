package com.zhuxl.dubbo.provider.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderDTO implements Serializable {
    private String orderId;

    private String name;

    private String shopId;

    private Double price;
}
