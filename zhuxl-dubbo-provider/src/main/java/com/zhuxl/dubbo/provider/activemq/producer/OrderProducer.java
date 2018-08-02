package com.zhuxl.dubbo.provider.activemq.producer;

import com.zhuxl.dubbo.provider.configuration.QueueConfig;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * @author zhuxl.cc@qq.com
 */
@Service("producer")
public class OrderProducer {

    @Autowired
    private QueueConfig queueConfig;

    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    public void sendOrder(final String message) {
        Destination queue = new ActiveMQQueue(queueConfig.getStock());
        jmsTemplate.convertAndSend(queue, message);
    }

    @JmsListener(destination = "order.queue")
    public void consumerMessage(String text) {
        System.out.println("从order.queue队列收到的回复报文为:" + text);
    }

}
