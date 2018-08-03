package com.zhuxl.express.provider.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaolong@aspirecn.com
 * @project zhuxl-springboot-dubbo-activemq
 * @package com.zhuxl.stock.provider
 * @date 2018/8/2 12:50
 */
@Service
public class ExpressConsumer {

    @JmsListener(destination = "express.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiveOrderA(String message) {
        System.out.println("骑手A接收到的订单是:" + message);
    }

    @JmsListener(destination = "express.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiveOrderB(String message) {
        System.out.println("骑手B接收到的订单是:" + message);
    }

    @JmsListener(destination = "express.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiveOrderC(String message) {
        System.out.println("骑手C接收到的订单是:" + message);
    }


    @JmsListener(destination = "stock.queue")
    public void receiveOrderX(String message) {
        System.out.println("库存系统B接收到的订单是:" + message);
    }
}
