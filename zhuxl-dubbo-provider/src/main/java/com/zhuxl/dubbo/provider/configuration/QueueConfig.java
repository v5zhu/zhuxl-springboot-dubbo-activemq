package com.zhuxl.dubbo.provider.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhuxiaolong@aspirecn.com
 * @project zhuxl-springboot-dubbo-activemq
 * @package com.zhuxl.dubbo.provider.configuration
 * @date 2018/8/2 12:35
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "queue")
public class QueueConfig {
    private String stock;
}
