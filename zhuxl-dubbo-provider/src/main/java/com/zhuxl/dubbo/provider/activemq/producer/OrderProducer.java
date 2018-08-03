package com.zhuxl.dubbo.provider.activemq.producer;

import com.zhuxl.dubbo.provider.configuration.QueueConfig;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void sendToStock(final String message) {
        Destination queue = new ActiveMQQueue(queueConfig.getStock());
        jmsTemplate.convertAndSend(queue, message);
    }

    public void sendToExpress(final String message) {
        Destination topic = new ActiveMQTopic(queueConfig.getExpress());
        jmsTemplate.convertAndSend(topic, message);
    }

}
