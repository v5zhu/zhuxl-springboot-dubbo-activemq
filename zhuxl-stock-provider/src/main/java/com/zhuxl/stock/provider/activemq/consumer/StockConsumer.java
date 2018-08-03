package com.zhuxl.stock.provider.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaolong@aspirecn.com
 * @project zhuxl-springboot-dubbo-activemq
 * @package com.zhuxl.stock.provider
 * @date 2018/8/2 12:50
 */
@Service
public class StockConsumer {

    @JmsListener(destination = "stock.queue")
    public void receiveOrderA(String message) {
        System.out.println("库存系统A接收到的订单是:" + message);
    }
}
