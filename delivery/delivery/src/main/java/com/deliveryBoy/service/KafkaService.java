package com.deliveryBoy.service;

import com.deliveryBoy.config.KafkaConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public Boolean UpdateLocation(String location) {
        kafkaTemplate.send(KafkaConstant.TOPIC, location);
        log.info("Location updated: {}", location);
        return true;
    }
}
