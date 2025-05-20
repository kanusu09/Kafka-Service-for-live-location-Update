package com.endUser.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaconfig {

    @KafkaListener(topics = AppConstant.TOPIC, groupId = AppConstant.GROUP_ID)
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}

