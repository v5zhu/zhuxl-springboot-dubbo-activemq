package com.zhuxl.component.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivemqApplication {
    public static void main(String[] args) {
        new SpringApplication(ActivemqApplication.class).run(args);
    }
}
