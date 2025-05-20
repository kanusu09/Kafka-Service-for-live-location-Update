package com.deliveryBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class config {

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name(KafkaConstant.TOPIC)
                .partitions(10)
                .replicas(1)
                .build();
    }
}
