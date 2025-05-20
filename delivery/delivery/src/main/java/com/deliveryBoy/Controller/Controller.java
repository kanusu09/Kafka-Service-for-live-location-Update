package com.deliveryBoy.Controller;


import com.deliveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class Controller {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        // Call the KafkaService to send the location update
        kafkaService.UpdateLocation("("+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+ ")"); // Example location
     return new ResponseEntity<>(Map.of("message", "Location updated successfully"), HttpStatus.OK);
    }
}

